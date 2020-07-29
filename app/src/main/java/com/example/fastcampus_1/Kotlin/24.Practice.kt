package com.example.fastcampus_1.Kotlin

//접근수정자 실습

fun main(array: Array<String>) {
    val knight = Knight(20, 4)
    val monster = Monster(15, 5)

    knight.attack(monster)
    monster.attack(knight)

    /* knight.hp = 100
    //몬스터가 때리지 않아도 기사의 체력을 바꿀수있다 -> 접근수정자로 접근을 제한해야한다.

    knight.heal()
    //공격을 당하지 않아도 실행 -> 접근수정자로 접근을 제한해야한다.
     */
}

//오픈 클래스 knight 와 monster -> Character 클래스
open class Knight(private var hp: Int, private val power: Int) {
    fun attack(monster: Monster) {
        monster.defence(power)
    }

    fun defence(damage: Int) {
        hp -= damage
        if (hp > 0) {
            heal()
            println("기사의 현재 체력은 ${hp}입니다.")
        } else println("기사가 죽었습니다.")
    }

    private fun heal() {
        //공격을 당했을때, 죽지않았을 경우에만 실행
        hp += 3
    }
}

open class Monster(private var hp: Int, private val power: Int) {
    fun attack(knight: Knight) {
        knight.defence(power)
    }

    fun defence(damage: Int) {
        hp -= damage
        if (hp > 0) println("몬스터의 현재 체력은 ${hp}입니다.")
        else println("몬스터가 죽었습니다.")
    }
}
