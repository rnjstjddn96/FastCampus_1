package com.example.fastcampus_1.Kotlin

import java.nio.channels.Channels


fun main(array: Array<String>) {
//    var tv = TV("off")
//    tv.turnOff()
//    tv.turnOn()
//    tv.turnOn()
//    tv.addCH(11, "JTBC")
//    tv.changeCH(11)

    val tv = Television(listOf<String>("K", "M", "S"))
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())

}

//class TV {
//    var power = false
//    var ch: Int? = null
//    var chList = mutableMapOf<Int, String>(1 to "S", 2 to "M", 3 to "K")
//
//    constructor(power: String) {
//        this.power = power == "on"
//    }
//
//    fun turnOff() {
//        if (!power) {
//            println("already turned off")
//        } else {
//            this.power = false
//            ch = when (ch) {
//                null -> null
//                else -> null
//            }
//            println("TV를 끕니다")
//        }
//    }
//
//    fun turnOn() {
//        if (power) {
//            println("already turned on")
//        } else {
//            this.power = true
//            when (ch) {
//                null -> ch = 1
//            }
//            println("TV를 켭니다")
//        }
//    }
//
//    fun changeCH(key: Int) {
//        println("현재 시청중인 방송은 $key 번, ${chList.get(key)} 방송입니다.")
//    }
//
//    fun addCH(key: Int, name: String) {
//        chList.put(key, name)
//        println("$key 번에 $name 방송을 추가합니다.")
//    }
//}

class Television(val channels: List<String>) {
    var onOff: Boolean = false // True > On False -> Off
    var currentChannelNumber = 0
        set(value) { // currentChannelNumber에 어떤 값이 할당될떄 호출
            //currentChannelNumber = value //무한루프 발생 : StackOverflow
            field = value
            if (field > 2) field = 0
            else if (field < 0) field = 2
        }
        get() {
            println("호출되었습니다")
            return field
        }

    fun switch() {
        onOff = !onOff
    }

    fun channelUp() {
        currentChannelNumber += 1
//        channels.forEachIndexed{index, value ->
//            if(currentChannelNumber == index){
//                currentChannelNumber += 1
//                return
//            }
//        }
    }

    fun channelDown() {
        currentChannelNumber -= 1
//        channels.forEachIndexed{index, value ->
//            if(currentChannelNumber == index){
//                currentChannelNumber -= 1
//                return
//            }
//        }
    }

    fun checkCurrentChannel(): String {
        return channels[currentChannelNumber]
    }

}