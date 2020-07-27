package com.example.fastcampus_1.Kotlin

//제어 흐름(2)

fun main(args: Array<String>) {
    val value: Int = 4

    when (value) {
        1 -> {
            println("value = 1")
        }
        2 -> {
            println("value = 2")
        }
        3 -> {
            println("value = 3")
        }
        else -> {
            println("I don't know the value")
        }
    }

    if (value == 1) println("value = 1")
    else if (value == 2) println("value = 2")
    else if (value == 3) println("value = 3")
    else println("I don't know the value")

    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> "no Value"
    }
    println(value2)


}
