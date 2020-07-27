package com.example.fastcampus_1.Kotlin

fun main(args:Array<String>){

    val arr = arrayOf<Int>(1,2,3)

    //get, set
    val number = arr.get(0)
    //val number2 = arr.get(100) //인데스에 주의해야한다.
    println(number)

    arr.set(0,100)
    val number1 = arr.get(0)
    println(number1)

    //arr.set(100, 100)
    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
    //arr의 bounds는 처음 만들 때 결정! arr의 index -> 2

    //Array를 만드는 방법(3)
    val a1 = intArrayOf(1,2,3)
    val a2 = charArrayOf('a','b')
    val a3 = doubleArrayOf(1.1, 2.2, 3.3)
    var a4 = booleanArrayOf(true, false, true)

    //Array를 만드는 방법(4) -> lambda를 활용
    val a5 = Array(10, { 0 })
    val a6 = Array(5, {1;2;3;4;5})

    }