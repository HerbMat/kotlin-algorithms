package org.algorithm.merge

fun testMergeArray() {
    val firstArray = arrayOf(1,3,5,7)
    val secondArray  = arrayOf(0,2,4,6,8,9)
    val result = mergeArrays(firstArray, secondArray)

    print("[")
    result.forEach { print("$it ") }
    print("]")
}

fun mergeArrays(firstArray: Array<Int>, secondArray: Array<Int>): Array<Int> {
    val firstArraySize = firstArray.size
    var firstArrayIndex = 0
    val secondArraySize = secondArray.size
    var secondArrayIndex = 0
    val wholeArraySize = firstArraySize + secondArraySize
    var wholeArrayIndex = 0
    val mergeArray = Array(wholeArraySize){ i -> i }
    while(wholeArraySize > wholeArrayIndex) {
        if ((firstArrayIndex < firstArraySize) && (secondArrayIndex < secondArraySize)) {
            if (firstArray[firstArrayIndex] < secondArray[secondArrayIndex]) {
                mergeArray[wholeArrayIndex] = firstArray[firstArrayIndex]
                ++firstArrayIndex
            } else {
                mergeArray[wholeArrayIndex] = secondArray[secondArrayIndex]
                ++secondArrayIndex
            }
        } else if (firstArrayIndex >= firstArraySize) {
            mergeArray[wholeArrayIndex] = secondArray[secondArrayIndex]
            ++secondArrayIndex
        } else if (secondArrayIndex >= secondArraySize) {
            mergeArray[wholeArrayIndex] = firstArray[firstArrayIndex]
            ++firstArrayIndex
        }
        ++wholeArrayIndex
    }
    return mergeArray
}