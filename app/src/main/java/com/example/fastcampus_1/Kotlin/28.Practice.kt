package com.example.fastcampus_1.Kotlin

fun main(array: Array<String>) {
    val student_ = Student__()
    student_.eat()
    student_.sleep()

}
//interface에서 함수를 구현할 수 있다.
//interface에서 구현된 함수는 intrerface를 구현하는 클래스에서 구현하지 않아도된다.
interface Human__ {
    fun eat() {
        println("먹는다")
    }

    fun sleep() {
        println("잔다")
    }

    abstract fun study()
    //반듯이 구현해야하는 함수
}

class Student__ : Human__ {
    override fun study() {

    }

}

class SoccerPlayer_ : Human__ {
    override fun study() {

    }
}
