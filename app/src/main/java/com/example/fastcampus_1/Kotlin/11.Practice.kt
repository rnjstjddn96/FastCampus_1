package com.example.fastcampus_1.Kotlin

//11. 제어흐름(2) 실습

fun main(args: Array<String>) {
    var value: Int? = null

    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }
    var value2: Boolean? = null

    //when구문은 조건으로 갖는 값의 모든 경우에 대응해주는 것이 좋다.
    when (value2) {
        true -> println("")
        false -> println("")
        null -> println("")
    }
    //값을 리턴하는  when 구문은 반듯이 값을 리턴해야한다.
    var value3 = when (value2) {
        true -> 1
        false -> 3
        null -> 4

    }
    //when의 다양한 조건식
    val value4: Int = 10
    when (value4) {
        is Int -> println("true")
        else -> println("is not Int")
    }

    //when의 다양한 조건식(2)
    val value5: Int = 85
    val grade = when (value5) {
        in 60..70 -> "C"
        in 70..80 -> "B"
        in 80..90 -> "B+"
        in 90..100 -> "A"
        else -> "no grade"
    }
    println(grade)
}
