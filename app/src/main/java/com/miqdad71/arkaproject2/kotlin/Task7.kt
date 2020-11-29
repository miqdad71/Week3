package com.miqdad71.arkaproject2.kotlin

fun main (){
    print("Masukkan Tahun : ")
    var a = readLine()!!.toInt()
    println(leap(a))
}

fun leap (year:Int){
    if (year%4==0) {
        println("$year adalah tahun kabisat")
    } else {
        println("$year bukan tahun kabisat")
    }
}