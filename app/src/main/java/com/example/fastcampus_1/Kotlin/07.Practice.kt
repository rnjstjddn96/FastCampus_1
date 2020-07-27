package com.example.fastcampus_1.Kotlin

fun main(args:Array<String>){
    //산술 연산자
    var a = 10 + 1
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println()

    //대입 연산자
    val f = 1

    //복합 대입 연산자
    a += 10
    b -= 10
    c *= 2
    d /= 3
    e %= 3

    //증감연산자
    a++
    println(++a)
    a--
    println(a)

    //비교연산자
    var g : Boolean = a > b
    var h : Boolean = a == b
    var i : Boolean = a != b
    println(g)
    println(h)
    println(i)
    println()

    //논리연산자
    val j : Boolean = h && i
    val k = h || i
    val l = !k
    println(j)
    println(i)
    println(k)
}