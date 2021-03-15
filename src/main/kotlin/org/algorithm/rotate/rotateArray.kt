package org.algorithm.rotate

fun testRotateArray() {
    val testArray = arrayOf(1,2,3,4,5)
    val result = rotateArray(testArray, 2)
    result.forEach { print("$it ") }
    println("End")
}

fun rotateArray(array: Array<Int>, d: Int): Array<Int> {

    val arraySize = array.size
    val numberOfRotations = d.let {
        if (it > arraySize) {
            it % arraySize
        } else {
            it
        }
    }

    var tempVar = 0
    var i = 0
    while (i < numberOfRotations) {
        val lastPos = arraySize - numberOfRotations + i
        tempVar = array[i]
        for (curPos in (i+numberOfRotations)..lastPos step numberOfRotations) {
            array[curPos-numberOfRotations] = array[curPos]
        }
        array[lastPos] = tempVar
        ++i
    }
    return array
}