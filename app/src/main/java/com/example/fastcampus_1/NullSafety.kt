package com.example.fastcampus_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//var lateCar : Car = Car() // 초기화 오류 발생
lateinit var lateCar: Car //나중에 초기화 하겠다.

class Car(var number : Int) {
}

class NullSafety : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        var number: Int = 10
        var number1: Int? = null

        //var number3 = number? + number1
        var number3 = number1?.plus(number)
        //number1이 null이기 떄문에 plus함수 실행하지 않는
        Log.d("number", "number3 = " + number3)

        //삼항 연산자 -> 엘비스 연산자(?:)
        //Null Safety
        val number4 = number1 ?: 10
        Log.d("number", "number4 : " + number4)

        lateCar = Car(10)
            Log.d("number", "late number : " + lateCar.number)
        var numbner5 = number1!! + 10 //개발자가 number1이 null이 아님을 보장한다. -> null일 경우 에러 발생
    }

    fun plus(a: Int, b: Int?): Int {
        if (b != null) return a + b
        else return a
    }

    fun plus2(a: Int, b: Int?): Int? {
        return b?.plus(a)
    }
}
