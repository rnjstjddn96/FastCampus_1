package com.example.fastcampus_1.Kotlin

fun main(args: Array<String>) {
    val a : Int? = null
    val b : Int = 10
    val c : Int = 100

    if(a == null){
        println("a is null")
    }else{
        println("a is not null")
    }

    if(b + c == 110){
        println("b + c = 110")
    }else{
        println("b + c != 110")
    }

    println()

    //엘비스 연산자
    val number : Int? = null
    //number가 null일 경우 10을 대임

    val number2 = number ?: 10
    println(number2)

    val num1 = 10
    val num2 = 20

    var max = if (num1 > num2) num1 else num2
    println(max)
}




