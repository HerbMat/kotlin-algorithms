package org.algorithm

import org.algorithm.merge.testMergeArray
import org.algorithm.missingnumber.testMissingNumber
import org.algorithm.rotate.testRotateArray
import org.algorithm.trailingzeros.testTrailingZeros

fun main(args: Array<String>) {
//    testMissingNumber()
//    testTrailingZeros()
//    testRotateArray()
//    testMergeArray()
    val array = arrayOf(1,2,3)
    array[3] = 4
    array.forEach { print("$it ") }
}
