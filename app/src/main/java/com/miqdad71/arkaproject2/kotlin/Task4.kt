package com.miqdad71.arkaproject2.kotlin

fun main(){
    println("=== Hitung Usia ===")
    print("Masukkan Tahun Kelahiran : ")
    var a = readLine()!!.toInt()

    println(checkAge(a))
}

fun checkAge (a:Int):Int{
    print("Masukkan Tahun Saat Ini : ")
    var b = readLine()!!.toInt()
    var c = b - a

    print("Usia : ")
    return (c)
}
