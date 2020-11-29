package com.miqdad71.arkaproject2.kotlin

fun main(){
    var x = 10
    var y = 20

    println("Nilai X dan Y awal")
    println("Nilai X : $x | Nilai Y : $y")
    println("")
    var z = x
    x = y
    y = z

    println("Nilai X dan Y setelah ditukar")
    println("Nilai X : $x | Nilai Y : $y")
}