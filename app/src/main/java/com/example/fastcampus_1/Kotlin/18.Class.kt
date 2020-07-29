package com.example.fastcampus_1.Kotlin

//18.Class
//OOP-> Object Oriented Programming(객체지향 프로그래밍)
//객체란??
// - 이름이 있는 모든 것
// 객체 지향  프로그래밍 문제 해결 방법
// - 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다.

fun main(array: Array<String>) {
    //클래스를 통해서 실체를 만드는 방법
    //-> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")

    var bigCar = Car("v8 engine", "big")

    //우리가 만든 클래스는 자료형이 된다.
    var bigCar1 : Car = Car("v8 engine", "big")

    var superCar : SuperCar = SuperCar("goodEngine", "Big", "White")

    var runnableCar : RunnableCar = RunnableCar("Simple Engine", "simple body")
    runnableCar.navi("우리집")
    runnableCar.ride()
    runnableCar.drive()

    var runnableCar2 : RunnableCar2 = RunnableCar2("nice Engine", "nice body")
    runnableCar2.navi("학교")
    runnableCar2.ride()
    runnableCar2.drive()

    println()

    var testC : TestClass = TestClass()
    testC.test(1)
    testC.test(1,2)
}

//class 만드는 방법(1)
class Car(var engine: String, var body: String) {
}

//class 만드는 방법(2)
class SuperCar{
    var engine: String
    var body : String
    var door : String

    constructor(engine: String, body: String, door : String){
        this.engine = engine
        this.body = body
        this.door = door
    }
}

//class를 만드는방법(3) -> 1번 방법의 확장
class Car1 (engine : String, body: String){
    var door : String = ""

    constructor(engine: String, body: String, door: String) : this(engine,body) {
        this.door = door
    }
}

//class를 만드는방법(4) -> 2번 방법의 확장
class Car2{
    var engine : String = ""
    var body : String = ""
    var door : String = ""

    constructor(engine : String, body : String){
        this.engine = engine
        this.body = body
    }
    constructor(engine : String, body : String, door: String){
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunnableCar(engine: String, body: String){

    init{
        //객체가 인스턴스화 될때 가장먼저 실행되는 부분
        println("RunnableCar가 생성되었습니다.")
    }
    fun ride(){
        println("탑승 하였습니다.")
    }

    fun drive(){
        println("달립니다!")
    }

    fun navi(destination : String){
        println("$destination(으)로 목적지가 설정되었습니다. ")
    }
}

//RunnableCar와 동일한 클래스, RunnableCar2는 constructor를 사용하여 명시적으로 초기화
class RunnableCar2{
    var engine : String
    var body : String

    constructor(engine: String, body: String){
        this.engine = engine
        this.body = body
    }

    fun ride(){
        println("탑승 하였습니다.")
    }

    fun drive(){
        println("달립니다!")
    }

    fun navi(destination : String){
        println("$destination(으)로 목적지가 설정되었습니다. ")
    }
}

//오버로딩
// - 이름은 같지만 받는 인자의 수가 다른 함수
class TestClass(){
    fun test(a: Int){
        println("up")
    }
    fun test(a : Int, b : Int ){
        println("down")
    }

}

