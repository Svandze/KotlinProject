package com.example.homemenuform

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val actionBar = supportActionBar
        actionBar!!.title = "Segunda actividad"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val message=intent.getStringExtra("EXTRA_MESSAGE")
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = "Bienvenido, "+message
        }
    }
}