package com.example.calculationactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(){
        lateinit var btnAdd: Button
        lateinit var btnSub6: Button
        lateinit var btnMultiply5: Button
        lateinit var btndivision: Button
        lateinit var btnModulus5: Button
        lateinit var tvResult4: TextView
        lateinit var etFirstNumber2: EditText
        lateinit var etSecondNumber3: EditText
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    btnAdd = findViewById(R.id.btnAdd)
    btnSub6 = findViewById(R.id.btnSub6)
    btnMultiply5 = findViewById(R.id.btnMultiply5)
    btnModulus5 = findViewById(R.id.btnModulus5)
    btndivision=findViewById(R.id.btndivision)
    tvResult4 = findViewById(R.id.tvResult4)
    etFirstNumber2 = findViewById(R.id.etFirstNumber2)
    etSecondNumber3 = findViewById(R.id.etSecondNumber3)

    btnAdd.setOnClickListener {
        val number = etFirstNumber2.text.toString()
        val number2 = etSecondNumber3.text.toString()
        tvResult4.text=""
        if (number.isBlank()){
            etFirstNumber2.setError("Number is required")
            return@setOnClickListener

        }
        if(number2.isBlank()){
            etSecondNumber3.setError("Number is required")
            return@setOnClickListener
        }


        addition(number.toInt(), number2.toInt())
    }
    btnSub6.setOnClickListener {
        val number =etFirstNumber2.text.toString()
        val number2 = etSecondNumber3.text.toString()
        if (number.isBlank()){
            etFirstNumber2.setError("Number is required")
            return@setOnClickListener

        }
        if(number2.isBlank()){
            etSecondNumber3.setError("Number is required")
            return@setOnClickListener
        }
        subtracting(number.toInt(),number2.toInt())
    }
    btndivision.setOnClickListener {
        val number = etFirstNumber2.text.toString()
        val number2=etSecondNumber3.text.toString()
        if (number.isBlank()){
            etFirstNumber2.setError("Number is required")
            return@setOnClickListener

        }
        if(number2.isBlank()){
            etSecondNumber3.setError("Number is required")
            return@setOnClickListener
        }
        dividing(number.toInt(),number2.toInt())   //you want this activity to happen when the user has entered the value.
    }
    btnModulus5.setOnClickListener {
        val number = etFirstNumber2.text.toString()
        val number2=etSecondNumber3.text.toString()
        if (number.isBlank()){
            etFirstNumber2.setError("Number is required")
            return@setOnClickListener

        }
        if(number2.isBlank()){
            etSecondNumber3.setError("Number is required")
            return@setOnClickListener
        }
        remainder(number.toInt(),number2.toInt())

    }
    btnMultiply5.setOnClickListener {
        val number=etFirstNumber2.text.toString()
        val number2=etSecondNumber3.text.toString()
        if (number.isBlank()){
            etFirstNumber2.setError("Number is required")
            return@setOnClickListener

        }
        if(number2.isBlank()){
            etSecondNumber3.setError("Number is required")
            return@setOnClickListener
        }
        multip(number.toInt(),number2.toInt())
    }
}

fun addition(number: Int, number2: Int) {
    var sum = number + number2
    tvResult4.text = sum.toString()
}
fun subtracting(number: Int,number2: Int){
    var minus=number-number2
    tvResult4.text = minus.toString()
}
fun dividing(number:Int,number2:Int){
    var division=number/number2
    tvResult4.text=division.toString()
}
fun remainder(number:Int,number2: Int){
    var rem=number%number2
    tvResult4.text =rem.toString()


}
    fun multip(number: Int,number2: Int){
        var multiply=number*number2
        tvResult4.text=multiply.toString()
    }

}
