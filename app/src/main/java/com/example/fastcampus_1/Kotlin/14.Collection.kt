package com.example.fastcampus_1.Kotlin

//14. Collection
//-> list, set, map

fun main(args:Array<String>){

    //Immutable Collections (변경 불가능)
    //List -> 중복은 허용한다.
    val numberList = listOf<Int>(1,2,3,3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])
    println()

    //Set
    // -> 중복을 허용하지 않는다.
    // -> 순서가 없다!!! (index가 존재하지 않는다)
    val numberSet = setOf<Int>(1,2,3,3)
    println(numberSet)
    numberSet.forEach{
        println(it)
    }
    println()

    //Map -> key, value 형식으로 관리한다.
    val numberMap = mapOf<Int, String>(1 to "one", 2 to "two")
    println(numberMap.get(1))

    println()

    //mutable collections (변경 가능)
    //mutable List
    val mnumberList = mutableListOf<Int>(1,2,3)
    mnumberList.add(3,4)
    println(mnumberList)
    println()

    //mutable Set
    val mnumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mnumberSet.add(10)
    println(mnumberSet)
    println()

    //Mutable Map
    val mnumberMap = mutableMapOf<Int, String>(1 to "one", 2 to "two")
    mnumberMap.put(3, "three")
    println(mnumberMap)

}
