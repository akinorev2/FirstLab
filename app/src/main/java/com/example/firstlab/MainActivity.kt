package com.example.firstlab
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonChangeText: Button
    private lateinit var buttonChangeColor: Button
    private lateinit var textView: TextView

    private var textColorChanged = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        buttonChangeText = findViewById(R.id.buttonChangeText)
        buttonChangeColor = findViewById(R.id.buttonChangeColor)
        textView = findViewById(R.id.textView)

        // Set a click listener for the "Change Text" Button
        buttonChangeText.setOnClickListener {
            textView.text = "Text Changed!"
            // Reset text color to default
            textView.setTextColor(Color.BLACK)
            textColorChanged = false
        }

        // Set a click listener for the "Change Color" Button
        buttonChangeColor.setOnClickListener {
            if (!textColorChanged) {
                textView.setTextColor(Color.RED)
            } else {
                textView.setTextColor(Color.BLUE)
            }
            textColorChanged = !textColorChanged
        }
    }
}
