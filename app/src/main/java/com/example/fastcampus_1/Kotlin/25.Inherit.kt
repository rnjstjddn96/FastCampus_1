package com.example.fastcampus_1.Kotlin

//25. 상속
// -> 부모로부터 설명서를 물려받는다
fun main(array: Array<String>){
    val superCar = SuperCar100()
    superCar.drive()
    val bus = Bus100()
    //bus.drive() // -> 상속받지 않았으므로 사용 불가
}

//부모 Car100
//자식 SuperCar100, Truck100
open class Car100(){
    open fun drive() : String{
        return "drive"
    }

    open fun stop(){

    }
}

class SuperCar100() : Car100(){
    override fun drive(): String {
        val run = super.drive()
        return "$run fast"
    }

    override fun stop(){

    }
}

class Truck100() : Car100(){
}

class Bus100(){

}