package com.example.morningfirefoxcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var myAnswer:TextView ?= null
    var myFnum:EditText ?= null
    var mySnum:EditText ?= null
    var buttonAdd:Button ?= null
    var buttonSubtract:Button ?= null
    var buttonMultiply:Button ?= null
    var buttonDivide:Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myAnswer = findViewById(R.id.mTvanswer)
        myFnum = findViewById(R.id.Meditfnum)
        mySnum = findViewById(R.id.meditsnum)
        buttonAdd = findViewById(R.id.mbtnAdd)
        buttonSubtract = findViewById(R.id.mbtnsubtract)
        buttonMultiply = findViewById(R.id.mbtnmultiply)
        buttonDivide = findViewById(R.id.mbtndivide)
        //set onclick listeners to button
        buttonAdd!!.setOnClickListener {
            //receive the two numbers from the user
            var firstNumber = myFnum!!.text.toString().trim()
            var secondNumber = mySnum!!.text.toString().trim()
            //check if the user is submitting empty fields
            if (firstNumber.isEmpty()) {
                //Set an error to the firstNumber edit text
                myFnum!!.setError("please fill this input")
                myFnum!!.requestFocus()
            } else if (secondNumber.isEmpty()) {
                //set an error to the second number edit text
                mySnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            } else {
                //process to calculate the two numbers
                var answer = firstNumber.toDouble() + secondNumber.toDouble()
                //display the results on the textview myAnswer
                myAnswer!!.text = answer.toString()
            }
        }
        buttonSubtract!!.setOnClickListener {
            //receive the two numbers from the user
            var firstNumber = myFnum!!.text.toString().trim()
            var secondNumber = mySnum!!.text.toString().trim()
            //check if the user is submitting empty fields
            if (firstNumber.isEmpty()) {
                //Set an error to the firstNumber edit text
                myFnum!!.setError("please fill this input")
                myFnum!!.requestFocus()
            } else if (secondNumber.isEmpty()) {
                //set an error to the second number edit text
                mySnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()
            } else {
                //process to calculate the two numbers
                var answer = firstNumber.toDouble() - secondNumber.toDouble()
                //display the results on the textview myAnswer
                myAnswer!!.text = answer.toString()

            }
            buttonDivide!!.setOnClickListener {
                //receive the two numbers from the user
                var firstNumber = myFnum!!.text.toString().trim()
                var secondNumber = mySnum!!.text.toString().trim()
                //check if the user is submitting empty fields
                if (firstNumber.isEmpty()) {
                    //Set an error to the firstNumber edit text
                    myFnum!!.setError("please fill this input")
                    myFnum!!.requestFocus()
                } else if (secondNumber.isEmpty()) {
                    //set an error to the second number edit text
                    mySnum!!.setError("Please fill this input")
                    mySnum!!.requestFocus()
                } else {
                    //process to calculate the two numbers
                    var answer = firstNumber.toDouble() / secondNumber.toDouble()
                    //display the results on the textview myAnswer
                    myAnswer!!.text = answer.toString()
                }

            }
            buttonMultiply!!.setOnClickListener {
                //receive the two numbers from the user
                var firstNumber = myFnum!!.text.toString().trim()
                var secondNumber = mySnum!!.text.toString().trim()
                //check if the user is submitting empty fields
                if (firstNumber.isEmpty()) {
                    //Set an error to the firstNumber edit text
                    myFnum!!.setError("please fill this input")
                    myFnum!!.requestFocus()
                } else if (secondNumber.isEmpty()) {
                    //set an error to the second number edit text
                    mySnum!!.setError("Please fill this input")
                    mySnum!!.requestFocus()
                } else {
                    //process to calculate the two numbers
                    var answer = firstNumber.toDouble() * secondNumber.toDouble()
                    //display the results on the textview myAnswer
                    myAnswer!!.text = answer.toString()
                }

            }
        }
    }
}