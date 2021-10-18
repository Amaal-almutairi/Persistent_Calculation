package com.example.persistentcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var num1:EditText
    lateinit var num2:EditText
    lateinit var btnmulti:Button
    lateinit var display :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1 = findViewById(R.id.ednum1)
        num2 = findViewById(R.id.ednum2)
        btnmulti = findViewById(R.id.b1)
        display = findViewById(R.id.textv)

        btnmulti.setOnClickListener {


            try {
                var number1 = num1.text.toString().toFloat()
                var number2 = num2.text.toString().toDouble()
                var total = number1*number2
                display.text= " Multiply $number1*$number2 = $total"


            }catch (e:NumberFormatException){
                Toast.makeText(this," invalid!! please enter a number ",Toast.LENGTH_LONG).show()
            }
        }






    }




}
