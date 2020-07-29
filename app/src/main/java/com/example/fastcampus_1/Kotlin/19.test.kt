package com.example.fastcampus_1.Kotlin

import java.util.*

//19.Test

fun main(array: Array<String>) {
//    var arithOP = ArithmeticOP()
//    println(arithOP.add(9.0,3.0))
//    println(arithOP.div(9.0, 3.0))

//    var cal2 = Calculator()
//    println(cal2.add(1, 2, 3, 4, 5))
//    println(cal2.sub(10, 1, 2, 3))
//    println(cal2.mul(1, 2, 3))
//    println(cal2.div(18, 3, 3))
//
//    var cal3 = Calculator2(3)
//    println(cal3.plus(1).minus(3))


}

class ArithmeticOP {
    fun add(a: Double, b: Double): Double = a + b
    fun sub(a: Double, b: Double): Double = a - b
    fun mul(a: Double, b: Double): Double = a * b
    fun div(a: Double, b: Double): Double = a / b
}

class Calculator {
    fun add(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result += it
        }
        return result
    }

    fun sub(vararg numbers: Int): Int {
        var result = numbers[0]
        for (i in 1 until numbers.size) {
            result -= numbers[i]
        }
        return result
    }

    fun mul(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach { item ->
            result *= item
        }
        return result
    }

    fun div(vararg numbers: Int): Int {
        var result = numbers[0]
        numbers.forEachIndexed { index, value ->
            if (index != 0 && value != 0) {
                result /= value
            }
        }
        return result
    }
}

class Calculator2(val initialValue: Int) {
    fun plus(number: Int): Calculator2 {
        val result = this.initialValue + number
        return Calculator2(result)
    }

    fun minus(number: Int): Calculator2 {
        val result = this.initialValue - number
        return Calculator2(result)
    }

    fun mul(number: Int): Calculator2 {
        val result = this.initialValue * number
        return Calculator2(result)
    }

    fun div(number: Int): Calculator2 {
        val result = this.initialValue / number
        return Calculator2(result)
    }
}



