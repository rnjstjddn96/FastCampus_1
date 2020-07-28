package com.example.fastcampus_1.Kotlin

import android.os.Build
import androidx.annotation.RequiresApi

//Collection Practice

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4) //index를 정하지 않는 경우 맨뒤에 추가
    println(a)//[1, 2, 3, 4]
    a.add(0, 100)
    println(a)//[100, 1, 2, 3, 4]
    a.set(0, 200)
    println(a)//[200, 1, 2, 3, 4]
    a.removeAt(1)
    println(a)//[200, 2, 3, 4]
    println()


    val b = mutableSetOf<Int>(1,2,3,4)
    b.add(7)
    println(b)
    b.remove(2)
    println(b)
    b.remove(100)
    println(b)
    println()
    //없는 값을 삭제해도 에러는 발생하지 않는다

    val c = mutableMapOf<String, Int>("one" to 1)
    c.put("two", 2)
    println(c)
    c.replace("two", 3)
    println(c)
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)

}