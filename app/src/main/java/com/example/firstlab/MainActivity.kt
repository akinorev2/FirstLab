package com.example.firstlab
import android.graphics.Color
import android.os.Bundle

import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonChangeText: Button

    private lateinit var textView: TextView

    private var textColorChanged = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonChangeText = findViewById(R.id.buttonChangeText)

        textView = findViewById(R.id.textView)

        buttonChangeText.setOnClickListener {
            textView.text = "Text Changed!"

            textView.setTextColor(Color.BLACK)

        }



    }
}
