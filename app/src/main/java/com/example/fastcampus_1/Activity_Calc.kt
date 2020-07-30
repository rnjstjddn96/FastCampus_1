package com.example.fastcampus_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity__calc.*

class Activity_Calc : AppCompatActivity() {
    var total = 0
    var number  = "0"
    var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__calc)

        key0.setOnClickListener{
            number += "0"
            result.setText(number)
            value = number.toInt()
            Log.d("number", number)
        }

        key1.setOnClickListener{
            number += "1"
            result.setText(number)
            value = number.toInt()
            Log.d("number", number)
        }
        key2.setOnClickListener{
            number += "2"
            result.setText(number)
            value = number.toInt()
            Log.d("number", number)
        }
        key3.setOnClickListener{
            number += "3"
            result.setText(number)
            value = number.toInt()
            Log.d("number", number)
        }
        key4.setOnClickListener{
            number += "4"
            result.setText(number)
            value = number.toInt()
            Log.d("number", number)
        }
        key5.setOnClickListener{
            number += "5"
            result.setText(number)
            value = number.toInt()
            Log.d("number", number)
        }
        key6.setOnClickListener{
            number += "6"
            result.setText(number)
            value = number.toInt()
            Log.d("number", number)
        }
        key7.setOnClickListener{
            number += "7"
            result.setText(number)
            value = number.toInt()
            Log.d("number", number)
        }
        key8.setOnClickListener{
            number += "8"
            result.setText(number)
            value = number.toInt()
            Log.d("number", number)
        }
        key9.setOnClickListener{
            number += "9"
            result.setText(number)
            value = number.toInt()
            Log.d("number", number)
        }

        keyPlus.setOnClickListener{
            total += value
            number = "0"
            result.setText(total.toString())
        }
        keyCA.setOnClickListener{
            result.setText("0")
            total = 0
            number = "0"
        }

    }



}
