package com.example.fastcampus_1.Kotlin

import kotlin.math.min

fun plusThree(first : Int, second: Int, third : Int): Int {
    return first + second + third
}
fun minusThree(first : Int, second: Int, third : Int): Int = first - second - third
fun multiplyThree(first : Int = 1, second : Int = 1, third : Int = 1) : Int{
    return first * second * third
}

    // - 내부함수
    fun showMyPlus(first : Int, second : Int) : Int{
        println(first)
        println(second)
        fun plus(first: Int, second: Int) : Int{
            return first + second
        }
        return plus(first, second)
    }

fun main(args: Array<String>){
    var result1 = plusThree(1,2,3)
    var result2 = minusThree(5, 2,1)
    var result3 = multiplyThree(1,2,3)
    var result4 = multiplyThree() //first ,second, third의 default value가 모두 1

    println(result1)
    println(result2)
    println(result3)
    println(result4)
    println()

    var result5 = showMyPlus(5, 10)
    println(result5)
}
