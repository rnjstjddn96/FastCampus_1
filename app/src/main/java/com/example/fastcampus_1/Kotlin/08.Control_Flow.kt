package com.example.fastcampus_1.Kotlin


//08.제어흐름

fun main(args:Array<String>){
    var a = 5
    val b = 10


    //if~ else~ 사용방법(1)
//  0
    if(a > b){
//  1
        println("a가 b보다 크다")
    }else{
//  2
        println("a가 b보다 작다")
    }
//  3

    //if~ else~ 사용방법(2)
    if(a<b){
        println("a가 b보다 크다")
        //실행되지 않음
    }

    //if~ else~ 사용방법(3)
    a = 10
    if(a>b){
        println("a가 b보다 크다")
    }else if(a == b){
        println("a와 b는 같다")
    }else{
        println("a가 b보다 작다")
    }

    // - 값을 리턴하는 if 사용방법
    a++ // a = 11
    val max = if(a > b){
        a
    }else{
        b
    }

    val min = if(a > b) b else a
    println("max = " + max)
    println("min = " +  min)
}
