package com.example.fastcampus_1.Kotlin

//1번 문제
//list를 두개 만든다
//list1 에는 1부터 9까지 넣는다(반복문 사용)
//list2 에는 list1의 값이 홀수면 false 짝수면 true를 넣어준다.

//2번 문제
//학점 계산기
//80-90 -> A
//70 - 79 -> B
//60 - 69 -> C
//나머지 F

//3번문제
//전달받은 숫자의 각 자리 숫자의 합 구한다.
//전달받는 숫자는 무조건 두자리 숫자이다.

//4번문제
//구구단 출력

fun main(args:Array<String>) {
    //1
    var list1 = mutableListOf<Int>()
    var list2 = mutableListOf<Boolean>()
    for (i in 0..8) {
        list1.add(i, i + 1)
    }
    list1.forEach { item ->
        when (item % 2) {
            0 -> list2.add(true)
            else -> list2.add(false)
        }
    }
    println("list1 = " + list1)
    println("list2 = " + list2)

    //2
    println("점수를 입력하세요")
    val score = getScore()
    var grade: String = "F"
    when (score) {
        in 80..90 -> grade = "A"
        in 70 until 80 -> grade = "B"
        in 60 until 70 -> grade = "C"
        else -> grade = "F"
    }
    println("Your grade is " + grade)


    //3
    println("두 자리 숫자 입력")
    var num = getNum()
    var m : Int = num/10
    var n : Int = num%10
    println(m + n)

    //4
    for( a in 2..9){
        for( b in 1..9){
            println("$a x $b = ${a*b}")
        }
        println()
    }
}

fun getScore() : Int? {
    var score : Int?
    score = readLine()!!.toInt()
    return score
}

fun getNum() : Int {
    var num : Int = 99
    num = readLine()!!.toInt()
    return num
}

