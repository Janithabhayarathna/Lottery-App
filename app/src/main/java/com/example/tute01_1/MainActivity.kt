package com.example.tute01_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception
import java.util.*

class MainActivity : AppCompatActivity() {
    val res = mutableListOf<Int>()

    val gen: Random = Random()
    var new_number = 1 + gen.nextInt(49)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.bt)

        val button0 = findViewById<Button>(R.id.btn1)
        val button1 = findViewById<Button>(R.id.btn2)
        val button2 = findViewById<Button>(R.id.btn3)
        val button3 = findViewById<Button>(R.id.btn4)
        val button4 = findViewById<Button>(R.id.btn5)
        val button5 = findViewById<Button>(R.id.btn6)

        val result0 = findViewById<TextView>(R.id.result0)
        val result1 = findViewById<TextView>(R.id.result1)
        val result2 = findViewById<TextView>(R.id.result2)
        val result3 = findViewById<TextView>(R.id.result3)
        val result4 = findViewById<TextView>(R.id.result4)
        val result5 = findViewById<TextView>(R.id.result5)

        button.setOnClickListener {
            calculate(result0,result1,result2,result3,result4,result5)
        }

        button0.setOnClickListener {
            val temp = genNumber()
            result0.setText(temp.toString())
            res[0] = temp
        }
        button1.setOnClickListener {
            val temp = genNumber()
            result1.setText(temp.toString())
            res[1] = temp
        }
        button2.setOnClickListener {
            val temp = genNumber()
            result2.setText(temp.toString())
            res[2] = temp
        }
        button3.setOnClickListener {
            val temp = genNumber()
            result3.setText(temp.toString())
            res[3] = temp
        }
        button4.setOnClickListener {
            val temp = genNumber()
            result4.setText(temp.toString())
            res[4] = temp
        }
        button5.setOnClickListener {
            val temp = genNumber()
            result5.setText(temp.toString())
            res[5] = temp
        }
    }

    fun calculate(result0: TextView,result1: TextView,result2: TextView,result3: TextView,result4: TextView,result5: TextView) {

        var userInput = 0

        val editText = findViewById<EditText>(R.id.change)

        try {
            userInput = editText.text.toString().toInt()
        } catch (e: Exception) {

        }

        res.clear()
        while (res.size < 6) {
            if (new_number !in res && new_number != userInput)
                res.add(new_number)
            else
                new_number = 1 + gen.nextInt(49)
        }

        result0.setText(res[0].toString())
        result1.setText(res[1].toString())
        result2.setText(res[2].toString())
        result3.setText(res[3].toString())
        result4.setText(res[4].toString())
        result5.setText(res[5].toString())
        
    }

    fun genNumber(): Int {

        var num = gen.nextInt(49)
        if (num !in res) {
            return num
        } else {
            var num = gen.nextInt(49)
            return num
        }

    }
}