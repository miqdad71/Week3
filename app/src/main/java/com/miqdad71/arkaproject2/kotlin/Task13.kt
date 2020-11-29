package com.miqdad71.arkaproject2.kotlin

fun main() {
    println("Divide And Sort")
    print("Masukan Angka : ")
    dividedAndSort(readLine()!!.toLong())
}

val dividedAndSort = { num: Long ->
    val numToString = num.toString()
    val splitedNum = numToString.split("0")

    for (i in splitedNum.indices) {
        val result = splitedNum[i]
                .toList()
                .sorted()
                .joinToString("")
        print(result)
    }
}