package com.miqdad71.arkaproject2.kotlin

fun main(){
    print("Masukkan Radius : ")
    var r = readLine()!!.toDouble()
    println(largeCircle(r))
}

fun largeCircle (r:Double):Double{
    var large:Double
    if (r % 7.0 == 0.0) {
        large = (22/7)*r*r
    } else {
        large = 3.14*r*r
    }

    print("Luas Lingkaran : ")
    return (large)

}
