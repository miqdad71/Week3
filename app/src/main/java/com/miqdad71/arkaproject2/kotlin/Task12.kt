package com.miqdad71.arkaproject2.kotlin

fun main(){
    val text="Saya belajar Javascript"
    println(text)

    val reversed : String = text.split(" ").reversed().joinToString(" ")
    println(reversed)
}