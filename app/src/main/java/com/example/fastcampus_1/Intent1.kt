package com.example.fastcampus_1


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent.*
import kotlinx.android.synthetic.main.activity_intent2.*

class Intent1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        change_activity.setOnClickListener{
//            var intent = Intent(this@Intent1, Intent2::class.java) //요청을 생성
//            //Key, Value 방식 -> Key와 Value를 쌍으로 보내어 저장한다.
//            intent.putExtra("number1", 1)
//            intent.putExtra("number2", 2)
//            startActivity(intent)



            //명시적 인텐트
            val intent2 = Intent(this, Intent2::class.java)
            // apply -> 코드를 읽는 사람이 더 쉽게 이해
            intent2.apply {
                this.putExtra("number1", 1)
                this.putExtra("number2", 2)
            }
            // startActivity(intent2)// 전달만 하는 요청
            startActivityForResult(intent2, 25) //리턴을 받는 요청


//            //암시적 인텐트
//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
//            startActivity(intent)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == 25){
            Log.d("number", requestCode.toString())
            Log.d("number",resultCode.toString())
            val result = data?.getIntExtra("result", 0)
            Log.d("number",result.toString())
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}
