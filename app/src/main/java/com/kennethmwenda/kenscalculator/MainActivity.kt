package com.kennethmwenda.kenscalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // our code goes here
        btn_Add.setOnClickListener {
            if (et_Num1.text.toString()==""||et_Num2.text.toString()=="")
                Toast.makeText(this, "Please enter numbers", Toast.LENGTH_SHORT).show()
            else {
                val num1 = et_Num1.text.toString()
                val num2 = et_Num2.text.toString()
                val result = num1.toFloat() + num2.toFloat()
                textViewResult.text = result.toString()
            }
        }
        btn_Sub.setOnClickListener {
            if (et_Num1.text.toString()==""||et_Num2.text.toString()=="")
                Toast.makeText(this, "Please enter numbers", Toast.LENGTH_SHORT).show()
            else {
                val num1 = et_Num1.text.toString()
                val num2 = et_Num2.text.toString()
                val result = num1.toFloat() - num2.toFloat()
                textViewResult.text = result.toString()
            }
        }
        btn_Div.setOnClickListener {
            if (et_Num1.text.toString()==""||et_Num2.text.toString()=="")
                Toast.makeText(this, "Please enter numbers", Toast.LENGTH_SHORT).show()
            else {
                val num1 = et_Num1.text.toString()
                val num2 = et_Num2.text.toString()
                val result = num1.toFloat() / num2.toFloat()
                textViewResult.text = result.toString()
            }
        }
        btn_Mul.setOnClickListener {
            if (et_Num1.text.toString()==""||et_Num2.text.toString()=="")
                Toast.makeText(this, "Please enter numbers", Toast.LENGTH_SHORT).show()
            else {
                val num1 = et_Num1.text.toString()
                val num2 = et_Num2.text.toString()
                val result = num1.toFloat() * num2.toFloat()
                textViewResult.text = result.toString()
            }
        }
    }
}