// Derived from https://github.com/JetBrains/intellij-plugins/blob/master/Dart/testSrc/com/jetbrains/lang/dart/injection/DartInjectionTest.java
package com.github.jakobeha.intellijsmplcoccinelle.injection

import com.github.jakobeha.intellijsmplcoccinelle.SmPLTestUtils
import com.intellij.codeInsight.daemon.quickFix.LightQuickFixTestCase
import com.intellij.lang.injection.InjectedLanguageManager
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.DebugUtil
import com.intellij.testFramework.ParsingTestCase
import com.intellij.testFramework.TestDataPath


// We just reuse the parsing testData path because injection is in every file
@TestDataPath("\$PROJECT_ROOT/src/test/testData/parsing")
class SmPLInjectionTest : LightQuickFixTestCase() {
    override fun getTestDataPath(): String = SmPLTestUtils.BASE_TEST_DATA_PATH + "/parsing/"

    @Throws(Exception::class)
    private fun doTest() {
        val testName = getTestName(false)
        configureByFile("$testName.cocci")
        ParsingTestCase.doCheckResult(testDataPath, "$testName.inject.txt", toParseTreeText(file))
    }

    private fun toParseTreeText(file: PsiFile): String {
        return DebugUtil.psiToString(file, true, false) { psiElement, consumer ->
            InjectedLanguageManager.getInstance(project).enumerate(psiElement!!) { injectedPsi, _ ->
                consumer.consume(injectedPsi)
            }
        }
    }

    fun testAction() { doTest() }
    fun testDeviceAttr() { doTest() }
}