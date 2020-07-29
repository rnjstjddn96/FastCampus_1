package com.example.fastcampus_1.Kotlin

//27.인터페이스
// - 인터페이스는 약속

//interface를 구현하는 클래스는 인터페이스가 가지고 있는 기능을 반드시 구현하여야 한다.
//interface는 생성자가 없다 -> 인스턴스를 생성할 수 없다.

//상속이 만들어낸 특징
// -자식 클래스는 부모 클래스의 타입.
// -부모 클래스는 자식 클래스의 타입이 아니다.
// -> interface에도 동일

//ineterface vs inheritance
// -> 부모클래스의 메소드와 매우 유사한 메소드를 구현할 예정이라면 상속
//
// -> 비슷한 메소드를 만드는 것이 아니라면 interface
// -> 협업을 하는 경우 interface


fun main(array: Array<String>){
    val student_ = Student_()
    student_.eat()
    student_.sleep()

}

interface  Human_{
    fun eat()
    fun sleep()
}

class Student_ : Human_{
    override fun eat() {

    }

    override fun sleep() {

    }

}

class SoccerPlayer : Human_{
    override fun eat() {

    }

    override fun sleep() {

    }
}



open class Human{
    fun eat(){

    }
    fun sleep(){

    }
}

class Student : Human(){

}

class Teacher : Human(){

}