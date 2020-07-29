package com.example.fastcampus_1.Kotlin

//변수의 접근 범위
//1.전역변수
//2.지역변수

var number100: Int = 10

fun main(array: Array<String>) {

    val test = Test("권성우")
    println(number100)
    println(test.name)
    test.testFun()
    println(number100)
    println(test.name)

}

class Test(var name: String) {

    fun testFun() {
        var birth : String = "19960225"
        //함수안에서만 접근 가능한 변수
        name = "홍길동"
        number100 = 100
    }

    fun testFun2(){
        name = "길동홍"
        // birth = "1111111" //접근할 수 없다

    }
}