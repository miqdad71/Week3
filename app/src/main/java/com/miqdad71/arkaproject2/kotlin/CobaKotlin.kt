package com.miqdad71.arkaproject2.kotlin

//  Comment satu line

/*Comment multiline
    baris1
    baris2
*/

//    Penulisan Gaya Variabel/File/Lainnya

/*  PascalCase -> ArkademyAndroid(File Name)
    camelCase -> androidDua (variabel, function)
    snake_case -> arkademy_bootcamp (layout xml)
*/

fun main() {

//     contoh cetak
    print("Arkademy Bootcamp")
    println("Android Batch 2!!!")

//     variabel immutable
    val name = "Miqdad"
    val age: Int = 22

//     variabel Mutable
    var nilai = 3.56
    println("Nilai: $nilai")
    nilai = 3.75
    println("Nilai: $nilai")
    println("Nama: $name")
    println("Umur: $age")

//    Concatenation
    println("Nama saya " + name + ", umur saya " + age)

//    Template Literal (recomend)
    println("Nama saya $name, umur saya $age tahun, dan saya mendapatkan nilai IPK $nilai" )

    val height: Int = 175
    var weight: Int? = null

//     weight_.toDouble antara tanda tanya dan tanda seru (?/!) jika nilai tidak ada
    println("Berat badan $name: ${weight?.toDouble() ?: "80"} kg")
    print("Tinggi badan $name: $height cm")

}