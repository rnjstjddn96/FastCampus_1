package com.example.fastcampus_1.Kotlin
// 01.Variable -> 변수

// variable or value?
//  -1. 변하지 않는 값이라면 val
//  -2. 진짜 모르겠다면 무조건 var

var num = 10;
var hello = "hello";
var point = 3.4;

val fix = 20;

fun main(args:Array<String>){
    println(num);
    println(hello);

    num = 1;
    hello = "hi";

    println(num);
    println(hello);

    //fix = 20;
    //val cannot be assigned

}