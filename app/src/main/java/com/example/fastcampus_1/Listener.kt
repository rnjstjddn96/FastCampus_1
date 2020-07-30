package com.example.fastcampus_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.DragEvent
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {

    var number = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        //뷰를 activity로 가져오는 방법
        // 1. 직접 찾아서 가져온다.
        //val textView : TextView = findViewById(R.id.hello)

        // 2. xml을 import해서 가져온다.
        //kotlin에서만 가능
        //hello.


        //1 -> 이름이 필요한 방식(click)
        var click = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("click", "click!!")
            }
        }
        hello.setOnClickListener(click)

        //2 -> 익명함수 방식
        hello.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("click", "click!!")
            }
        })

        //3 -> 람다방식
        hello.setOnClickListener {
            Log.d("click", "click!!")
            hello.setText("권성우")
            image.setImageResource(R.drawable.person)
            number += 10
            Log.d("number", number.toString())
        }


        //뷰를 조작하는 함수들
        //1> setText
        //2> setImageResource



    }
}

