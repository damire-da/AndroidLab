package com.example.l2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redBtn = findViewById<Button>(R.id.button)

        redBtn?.setOnClickListener() {
            Toast.makeText(this@MainActivity, R.string.red_btn, Toast.LENGTH_LONG).show()
        }

        val greenBtn = findViewById<Button>(R.id.button2)

        greenBtn?.setOnClickListener() {
            Toast.makeText(this@MainActivity, R.string.green_btn, Toast.LENGTH_LONG).show()
        }
    }
}