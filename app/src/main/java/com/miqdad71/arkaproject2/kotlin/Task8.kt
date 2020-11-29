package com.miqdad71.arkaproject2.kotlin

fun main (){
    print("Masukkan Nilai Matematika : ")
    var math = readLine()!!.toDouble()
    print("Masukkan Nilai Bhs. Inggris : ")
    var eng = readLine()!!.toDouble()
    print("Masukkan Nilai Bhs. Indonesia : ")
    var ind = readLine()!!.toDouble()
    print("Masukkan Nilai IPA : ")
    var science = readLine()!!.toDouble()
    println(gradeScore(math, eng, ind, science))
}

fun gradeScore (math:Double, eng:Double, ind:Double, science:Double){
    var avarage = (math+eng+ind+science)/4
    println("Rata-rata = $avarage")
    when (avarage) {
        in 90.0..100.0 -> println("Grade A")
        in 80.0..89.0 -> println("Grade B")
        in 70.0..79.0 -> println("Grade C")
        in 60.0..69.0 -> println("Grade D")
        in 0.0..59.0 -> println("Grade E")
    }
}