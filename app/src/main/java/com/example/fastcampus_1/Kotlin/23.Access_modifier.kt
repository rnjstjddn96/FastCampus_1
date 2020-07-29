package com.example.fastcampus_1.Kotlin

//접근 수정자

fun main(array: Array<String>){
    val testAccess = TestAccess("아무개")
    //testAccess.test()
    //TestAccess클래스의 private 함수이므로 클래스 밖에서 접근할 수 없다
    println(testAccess.name)
    testAccess.name = "아무개2"
    println(testAccess.name)
    val reward = Reward()
    //reward.rewardAmount = 2000
    //Reward클래스의 private 변수이므로 클래스 밖에서 접근할 수 없다

    val runningCar = RunningCar()
    runningCar.runFast()
    //runningCar.run() //->접근 불가능
}

class Reward(){
    private var rewardAmount = 1000
}
class TestAccess{
    var name : String = "권성우"

    constructor(name : String){
        this.name = name
    }

    private fun test(){
        println("test")
    }
}
class RunningCar {
    fun runFast(){

    }

    private fun run(){

    }
}