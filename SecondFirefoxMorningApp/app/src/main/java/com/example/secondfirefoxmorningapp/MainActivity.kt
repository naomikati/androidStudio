package com.example.secondfirefoxmorningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //instantiate the UI element
    var buttonRegister:Button ?= null
    var buttonLogin:Button ?= null
    var myPhoto:ImageView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //reference the elements using there respective IDs
        buttonRegister = findViewById(R.id.mBtnRegister)
        buttonLogin = findViewById(R.id.mBtnLogin)
        myPhoto = findViewById(R.id.myPhoto)
        //set listeners to the element
        buttonRegister!!.setOnClickListener {
            Toast.makeText(applicationContext, "Register button clicked", Toast.LENGTH_SHORT).show()
        }
        buttonLogin!!.setOnClickListener {
            Toast.makeText(applicationContext, "Login button clicked", Toast.LENGTH_SHORT).show()
        }
        myPhoto!!.setOnClickListener {
            Toast.makeText(applicationContext, "Image photo clicked", Toast.LENGTH_SHORT).show()
        }
        }

}
