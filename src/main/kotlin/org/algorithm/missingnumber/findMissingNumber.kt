package org.algorithm.missingnumber

fun testMissingNumber() {
    val intArray = arrayOf(1,2,3,5)
    println("Hello World! ${findMissingNumber(intArray, intArray.size + 1)}")
    val intArray2 = arrayOf(1,2,3,4,5,6,7,8,10)
    println("Hello World! ${findMissingNumber(intArray2, intArray2.size + 1)}")
    val intArray3 = arrayOf(2)
    println("Hello World! ${findMissingNumber(intArray3, intArray3.size + 1)}")
}

fun findMissingNumber(numberArray: Array<Int>, range: Int): Int {
    if (numberArray.isEmpty()) {
        return -1;
    }

    var sum = 0
    for (i in 1..range) {
        sum += i
    }
    numberArray.forEach { sum -= it }
    if (sum == range) {
        return -1
    }
    return sum
}