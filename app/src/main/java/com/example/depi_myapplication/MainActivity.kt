package com.example.depi_myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var textview: TextView
    lateinit var button1: Button
    lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById(R.id.button1)
        textview = findViewById(R.id.textView)
        button2 = findViewById(R.id.button2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button1.setOnClickListener {
            rightButtonclicked()
        }

        button2.setOnClickListener {
            leftButtonclicked()
        }
    }

    fun rightButtonclicked() {
        textview.text = "right clicked"
        button1.text = "clicked"
        button2.text = "left"
    }

    fun leftButtonclicked() {
        textview.text = "left clicked"
        button2.text = "clicked"
        button1.text = "right"
    }
}
