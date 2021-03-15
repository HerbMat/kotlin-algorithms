package org.algorithm.trailingzeros

fun testTrailingZeros() {
    println("Result ${findTrailingZeros(5)}")
    println("Result ${findTrailingZeros(30)}")
    println("Result ${findTrailingZeros(250)}")
}

fun findTrailingZeros(n: Int): Int {
    var zerosCount = 0;
    var i = 5
    while (n / i >= 1) {
        zerosCount += n / i
        i *= 5
    }
    return zerosCount
}