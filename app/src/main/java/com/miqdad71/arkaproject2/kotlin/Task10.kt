package com.miqdad71.arkaproject2.kotlin

fun main (){
    print("Masukkan kata : ")
    var kata = readLine()!!.toString()
    words(kata)
}

fun words (kata:String) {
    var vowel = ""
    var consonant = ""
    var arrayWord = kata.split("").toTypedArray()
    for (i in 0..kata.length) {
        if (       arrayWord[i].equals("A")
                || arrayWord[i].equals("I")
                || arrayWord[i].equals("U")
                || arrayWord[i].equals("E")
                || arrayWord[i].equals("O"))
        {
            vowel += arrayWord[i] + "\n"
        } else {
            consonant += arrayWord[i] + "\n"
        }
    }
    print(vowel)
    print(consonant)
}