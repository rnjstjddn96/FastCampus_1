package com.example.fastcampus_1.Kotlin

    var a = 1 + 2 + 3 + 4 + 5 // 연산의 결과값을 변수에 넣어줄 수 있다.
    var b = "1"
    var c = b.toInt()
    var d  = b.toFloat()
    var e = "John"
    var f = "My name is $e Nice to meet you"


    //NULL
    //-존재하지 않는다.
    //var abc : Int = null -> Int형은 null값을 가질수 없다.
    var abc1 : Int? = null
    var abc2 : String? = null
    // 변수 abc1는 null을 가질 수 있는 Int?형이다.
    // 변수 abc2는 null을 가질 수 있는 String?형이다.

    fun main(args:Array<String>){
        println(a)
        println(b)
        println(c)
        println(d)
        println(f)
    }