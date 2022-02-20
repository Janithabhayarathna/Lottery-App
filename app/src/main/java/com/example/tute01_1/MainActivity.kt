package com.example.tute01_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.bt)

        button.setOnClickListener {
            calculate()
        }
    }

    fun calculate() {

        val result0 = findViewById<TextView>(R.id.result0)
        val result1 = findViewById<TextView>(R.id.result1)
        val result2 = findViewById<TextView>(R.id.result2)
        val result3 = findViewById<TextView>(R.id.result3)
        val result4 = findViewById<TextView>(R.id.result4)
        val result5 = findViewById<TextView>(R.id.result5)

        val res = mutableListOf<Int>()

        val gen: Random = Random()
        var new_number = 1 + gen.nextInt(49)

        while (res.size < 6) {
            if (new_number !in res)
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

        var editText = findViewById<EditText>(R.id.change)

        var input = editText.text.toString()
        
    }
}