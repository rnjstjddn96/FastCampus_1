package com.example.fastcampus_1.Kotlin

import kotlin.reflect.typeOf

//29.Generic(제너릭)
//목적 : 타입을 체킹하는 기능
//- 제너릭은 만들기 어렵고 잘 사용하지 않음으로 방법만 익힌다.

fun main(args:Array<String>){

    //Generic을 사용하지 않은 경우다 -> 형(타입)변환이 필요하다.
    var list1 = listOf(1,2,3,"a")
    val b : String = list1[2].toString() //형변환(타입 변환)

    //Generic을 사용하는 경우 -> 타입이 안전하
    var list2 = listOf<String>("a", "b", "c")
    val c : String = list2[2] //String이라는 것을 보장받는다.

    //강한 타입을 체크할 수 있다.
    var list3 = listOf(1,2,3,"a","b","c",1.0)
    //var list4 = listOf<Int>(1,2,3,4,"a") //강한 타입 체크

    //제너릭을 사용하지 않은경우
    var list5 = listOf<Any>(1,2,3,"가") // -> Any 타입
    //부모 : Any
    //자식 : String, Int , Float


}


