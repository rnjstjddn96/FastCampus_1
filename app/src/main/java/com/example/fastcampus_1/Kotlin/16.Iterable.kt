package com.example.fastcampus_1.Kotlin

// 16. Iterable

fun main(args: Array<String>){

    val a = mutableListOf<Int>(0,1,2,3,4,5,6,7,8,9)

    //반복하는 방법(1)
    for(item in a){
        if(item == 5){
            println("item is Five")
        }else{
            println("item is not Five")
        }
    }
    println()

    //반복하는 방법(2)
    for((index, item) in a.withIndex()){
        println("index : " + index + " value : " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + any = 문자열
    }

    println()

    //반복하는 방법(3)
    a.forEach{
        println(it)
    }

    println()

    //반복하는 방법(4)
    a.forEach{item ->
        println(item)
    }
    println()

    //반복하는 방법(5)
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + item)
    }
    println()

    //반복하는 방법(6)
    for( i in 0 until a.size){
        //until은 마지막을 포함하지 않는다.
        //0 부터 9
        println(a[i])
    }
    println()

    for( i in 0..a.size - 1){
        //0 부터 9
        println(a[i])
    }
    println()

    //반복하는 방법(7)
    for( i in 0 until a.size step(2)){
        //index가 0부터 짝수번째인 값만 출력
        println(a.get(i))
    }
    println()

    //반복하는 방법(8)
    for(i in a.size - 1 downTo (0)){
        // 9부터 0까지 반복
        println(a.get(i))
    }
    println()

    //반복하는 방법(9)
    for(i in a.size - 1 downTo (0) step(2)){
        //index가 9 7 5 3 1인 값만 출력
        println(a.get(i))
    }
    println()

    //반복하는 방법(10)
    for( i in 0..10){
        //..은 마지막을 포함한다.
        println(i)
    }
    println()

    //반복하는 방법(11)
    var a1 = 0
    var b1 = 4

    while(a1<b1){
        a1++
        println(a1)
    }
    println()

    //반복하는 방법(12)
    do{
        println("Hello")
    }while(b1 < a1)
}