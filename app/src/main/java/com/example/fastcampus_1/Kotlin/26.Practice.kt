package com.example.fastcampus_1.Kotlin

//26.상속 실습

//24.Practice 참조
//superknight
//supermonster class 생성

fun main(array: Array<String>){
    val superMonster = SuperMonster(100, 10)
    val superKnight = SuperKnight(130, 8)
    superMonster.attack(superKnight)
    superMonster.bite(superKnight)
}


//상속이 만들어낸 특징
// -자식 클래스는 부모 클래스의 타입.
// -부모 클래스는 자식 클래스의 타입이 아니다.
open class Charactor(private var hp: Int, val power: Int) {

    fun attack(charactor: Charactor, power : Int = this.power) {
        charactor.defence(power)
    }

    open fun defence(damage: Int) {
        hp -= damage
        if (hp > 0) {
            println("${javaClass.simpleName}현재 체력은 ${hp}입니다.")
            //javaClass.simpleName -> class의 이름을 출력
        } else println("죽었습니다.")
    }

}

//자식 클래스가 인스턴스화 되기 위해서는 부모클래스가 선행되서 인스턴스화 되어야 한다.
class SuperKnight(hp : Int, power : Int) : Charactor(hp, power){
    val defencePower = 2
    override fun defence(damage: Int) {
        super.defence(damage - defencePower)
    }
}

class SuperMonster(hp : Int, power : Int) :Charactor(hp, power){
    fun bite(charactor: Charactor){
        super.attack(charactor, power + 2)
    }
}