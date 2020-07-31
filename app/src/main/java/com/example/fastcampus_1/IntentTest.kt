package com.example.fastcampus_1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_intent_test.*
import kotlinx.android.synthetic.main.activity_intent_test.view.*

class IntentTest : AppCompatActivity() {
    var address = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_test)

       /*
       //1번 방법
        btnGo.setOnClickListener {
            address = etUri.text.toString()
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }*/



        //2번 방법
        etUri.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                Log.d("edit", "afterTextChanged : " + s)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("edit", "beforeTextChanged : $s,  count : $count,  after : $after ")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edit", "onTextChanged : $s, count : $count, after : $before ")
                address = s.toString()
            }
        })

        btnGo.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }



    }
}
