package com.miqdad71.arkaproject2.kotlin


fun main (){
    println("=== Hitung Luas Segitiga ===")
    print("Masukkan Panjang Alas : ")
    var base = readLine()!!.toDouble()

    print("Masukkan Tinggi : ")
    var high = readLine()!!.toDouble()

    println(largeTriangle(base, high))
}

fun largeTriangle (base:Double, high:Double):Double{
    var large = (base*high)/2
    print("Luas Segitiga : ")
    return (large)
}

