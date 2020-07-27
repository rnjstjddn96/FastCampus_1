package com.example.fastcampus_1.Kotlin

//12.배열

//배열이 필요한 이유
// - 그룹이 필요할때

fun main(args:Array<String>){
    //배열을 생성하는 방법(1)
    var group1 = arrayOf<Int>(1,2,3,4,5)
    println(group1 is Array)

    //배열을 생성하는 방법(2)
    var group2 = arrayOf(1,2,3.5,"hello")

    //배열에서 값을 꺼내는 방법(1)
    var a = group1.get(0)
    println(a)

    //배열에서 값을 꺼내는 방법(2)
    var b = group1[0]
    println(b)

    //배열에서 값을 바꾸는 방법(1)
    group1.set(0,2)
    println(group1[0])

    //배열에서 값을 바꾸는 방법(1)
    group1[0] = 3
    println(group1[0])

}