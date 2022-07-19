package com.example.mytwopagewebapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var buttonGoToWeb:Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonGoToWeb = findViewById(R.id.mBtnGoToWeb)
        buttonGoToWeb!!.setOnClickListener {
            var goToWebIntent = Intent(applicationContext,WebActivity::class.java)
            startActivity(goToWebIntent)
        }
    }
}