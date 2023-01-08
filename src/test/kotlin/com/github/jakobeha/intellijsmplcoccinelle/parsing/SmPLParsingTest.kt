package com.github.jakobeha.intellijsmplcoccinelle.parsing

import com.intellij.testFramework.ParsingTestCase
import com.github.jakobeha.intellijsmplcoccinelle.SmPLFileType
import com.github.jakobeha.intellijsmplcoccinelle.SmPLTestUtils
import com.intellij.testFramework.TestDataPath


@TestDataPath("\$CONTENT_ROOT/src/test/testData/parsing")
class SmPLParsingTest : ParsingTestCase("parsing", SmPLFileType.defaultExtension, SmPLParserDefinition()) {
    override fun getTestDataPath(): String = SmPLTestUtils.BASE_TEST_DATA_PATH
    override fun skipSpaces(): Boolean = true
    private fun doTest() { doTest(true, true) }

    fun testAction() { doTest() }
    fun testDeviceAttr() { doTest() }
}