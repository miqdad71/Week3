package com.miqdad71.arkaproject2.kotlin

fun main(){
    print("Masukkan Kata : ")
    var word = readLine()!!.toString()
    var code = ""
    for (i in word.length-1 downTo 0){
        code += word[i]
    }
    if (word != code) {
        println(" $code bukan kata palindrom")
    } else {
        println(" $code adalah kata palindrom")
    }
    }