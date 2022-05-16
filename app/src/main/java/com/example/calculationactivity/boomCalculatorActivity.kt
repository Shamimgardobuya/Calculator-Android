package com.example.calculationactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class boomCalculatorActivity: AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivision: Button
    lateinit var btnModulus: Button
    lateinit var tvResult: TextView
    lateinit var etFirstNumber: EditText
    lateinit var etSecondNumber: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boom_calculator)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult = findViewById(R.id.tvResult)
        etFirstNumber = findViewById(R.id.etFirstNumber)
        etSecondNumber = findViewById(R.id.etSecondNumber)

        btnAdd.setOnClickListener {
            val number = etFirstNumber.toString()
            val number2 = etSecondNumber.toString()
            addition(number.toInt(), number2.toInt())
        }
       btnSub.setOnClickListener {
           val number =etFirstNumber.toString()
           val number2 = etSecondNumber.toString()
           subtracting(number.toInt(),number2.toInt())
       }
        btnDivision.setOnClickListener {
            val number = etFirstNumber.toString()
            val number2=etSecondNumber.toString()
            dividing(number.toInt(),number2.toInt())   //you want this activity to happen when the user has entered the value.
        }
        btnModulus.setOnClickListener {
            val number = etFirstNumber.toString()
            val number2=etSecondNumber.toString()
            remainder(number.toInt(),number2.toInt())
        }
    }

    fun addition(number: Int, number2: Int) {
        var sum = number + number2
        tvResult.text = sum.toString()
    }
    fun subtracting(number: Int,number2: Int){
        var minus=number-number2
        tvResult.text = minus.toString()
    }
    fun dividing(number:Int,number2:Int){
        var division=number/number2
    }
    fun remainder(number:Int,number2: Int){
        var rem=number%number2
        tvResult.text =rem.toString()


    }

}

