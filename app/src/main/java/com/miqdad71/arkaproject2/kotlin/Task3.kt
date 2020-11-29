package com.miqdad71.arkaproject2.kotlin

fun main() {
    print("Masukkan angka : ")
    var a = readLine()!!.toInt()

    if (a % 2 == 0) {
        println("$a adalah bilangan genap")
    } else {
        println("$a adalah bilangan ganjil")}
    }