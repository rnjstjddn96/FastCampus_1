package com.example.fastcampus_1.Kotlin


fun main(array: Array<String>) {

//    val kwon = BankAccount("권성우", "1996-02-25", 100000)
//    kwon.checkAcc()
//    kwon.withdraw(44000)
//    kwon.save(44000)
//
//    val kim = BankAccount("김다현", "1996-12-29", 780000)
//    kim.checkAcc()

    val kwon = BankAccount2("권성우", "19960225")
    println(kwon.checkAcc())

}
class BankAccount {
    var name: String = ""
    var birth: String
    var balance: Int = 0

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if(balance >= 0){
            this.balance = balance
        }else{
            this.balance = 0
        }
        this.balance = balance
        println("$name 님 환영합니다")
    }

    fun checkAcc() {
        println("$name 님의 잔고는 $balance 원 입니다.")
    }

    fun save(amount: Int) {
        this.balance += amount
        println("$amount 원 입급, 현재 잔액 $balance 원입니다.")
    }

    fun withdraw(amount: Int) : Boolean {
        if(balance >= amount) {
            this.balance -= amount
            println("$amount 원 출금, 현재 잔액 $balance 원입니다.")
            return true
        }else{
            println("잔액부족")
            return false
        }
    }

}

//생성되는 instance의 balance의 초기값을 1000으로 지정
class BankAccount2(val name: String, val birth: String, balance: Int = 1000){
    val balance = if(balance >= 0) balance else 0
    fun checkAcc() : Int{
        return balance
    }
}