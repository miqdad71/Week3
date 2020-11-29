package com.miqdad71.arkaproject2.kotlin

fun main(){
    print("Masukkan Angka : ")
    var triangle = readLine()!!.toInt()
    println(rightTriangle(triangle))
}

fun rightTriangle(num: Int): String {
    var hasil: String = ""
    for(i in 1..num) {
        for(j in 0..num-i) {
            hasil += j+1
        }
        hasil += "\n"
    }
    return (hasil)
}

