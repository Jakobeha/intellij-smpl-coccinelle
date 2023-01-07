/** Derived from https://github.com/JetBrains/intellij-plugins/blob/master/Dart/testSrc/com/jetbrains/lang/dart/util/CaretPositionInfo.java */
package com.github.jakobeha.intellijsmplcoccinelle

data class CaretPositionInfo(
    val caretOffset: Int,
    val expected: String?,
    val completionEqualsList: List<String>?,
    val completionIncludesList: List<String>?,
    val completionExcludesList: List<String>?
)