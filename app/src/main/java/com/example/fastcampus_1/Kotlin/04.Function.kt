package com.example.fastcampus_1.Kotlin

// 04. Function
//- 함수란?
//      - 어떤 input값을 넣었을 때 어떤 output이 나오는 것
//      - y = x + 1
//- 함수를 선언하는 방법
// fun 함수명(변수명: 타입, 변수명: 타입 ...) : 반환 {
//      함수내용
//      return 반환값
//  }

fun plus(first: Int, second: Int): Int {
    var result: Int = first + second
    return result
}

// - default 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    var result: Int = first + second
    return result
}

// - 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit {
    var result: Int = first + second
    println(result)
}

// - 반환값이 없는 함수는 반환값 Type 생략가
fun printPlus2(first: Int, second: Int) {
    var result: Int = first + second
    println(result)
}

// - 간단하게 함수 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

// - 가변인자를 갖는 함수 선업 방법
fun plusMany(vararg numbers : Int){
    var sum : Int = 0
    for(number in numbers){
        sum += number
        println(number)
    }
    println(sum)
}

fun main(args: Array<String>) {
    val a = plus(1, 2)
    println(a)

    //인자를 명시적으로 전달
    val b = plus(first = 10, second = 20)
    val c = plus(second = 20, first = 10)
    println(b)
    println(c)

    println()

    // - default 값을 갖는 함수 호출하기
    var d: Int = plusFive(10, 20)
    println(d)

    var e: Int = plusFive(10)
    //second값을 부여하지 않았지만 default값 5를 가지므로 15를 반환한다.
    println(e)

    println()

    // - 반환값이 없는 함수 호출
    printPlus(17, 72)
    printPlus2(17, 72)

    println()

    // - 간단하게 선언한 함수 호출
    var rsShort = plusShort(19, 38)
    println(rsShort)

    println()

    // - 가변인자를 갖는 함수 호출
    plusMany(1,2,3)
}