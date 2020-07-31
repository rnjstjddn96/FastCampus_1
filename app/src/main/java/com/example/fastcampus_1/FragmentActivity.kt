package com.example.fastcampus_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity(), FragmentOne.onDataPassListener {

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)


        val fragmentOne = FragmentOne()
        // fragment에 데이터를 넣어주는 방법
        val bundle : Bundle = Bundle()
        bundle.putString("hello", "hello")
        fragmentOne.arguments = bundle

        button.setOnClickListener{
            //fragment를 동적으로 작동하는 방법
            //fragment를 붙이는 방법 add/replace
            //supportFragmentManager -> Activity가 가지고 있는 속
            val fragmentManager = supportFragmentManager

            //Transaction
            //작업의 단위 -> 시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentOne)
            fragmentTransaction.commit()
            //끝을 내는 방법
            //commit()      -> 시간 될 때 해 ( 좀더 안정적)
            //commitNow()   -> 지금 당장해

        }

        button2.setOnClickListener{
            // fragment remove/detach하는 방법
            var fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne)
            //fragmentTransaction.detach(fragmentOne) // -> 다시 붙일 수 없다.
            fragmentTransaction.commit()
        }

        Log.d("life_cycle", "onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d("life_cycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle", "onDestroy")
    }

    override fun onDataPass(data: String) {
        Log.d("pass", data?.toString())
    }
}
