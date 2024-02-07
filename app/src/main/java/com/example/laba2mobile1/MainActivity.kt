package com.example.laba2mobile1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    @SuppressLint("SetTextI18n")
    fun butAction(v : View){
       var result : TextView = findViewById(R.id.numberText)
        when(v.id){
            R.id.plusOne ->{
                result.text = "${result.text.toString().toInt() + 1}"
            }
            R.id.minusOne ->{
                result.text = "${result.text.toString().toInt() - 1}"
            }
            R.id.plusTwo ->{
                result.text = "${result.text.toString().toInt() + 2}"
            }
            R.id.minusTwo ->{
                result.text = "${result.text.toString().toInt() - 2}"
            }
        }
    }
}