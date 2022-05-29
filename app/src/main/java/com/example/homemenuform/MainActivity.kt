package com.example.homemenuform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.MutableLiveData

class MainActivity : AppCompatActivity() {

    lateinit var et1: EditText
    lateinit var et2: EditText
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et1 = findViewById(R.id.inp_username)
        et2 = findViewById(R.id.inp_password)
        btn = findViewById(R.id.btn_login)

        btn.setOnClickListener {
            if (et1.text.toString().length.equals(0) and et2.text.toString().length.equals(0)) {
                Toast.makeText(this, "Los campos se encuentran vacíos", Toast.LENGTH_LONG).show()
            } else if (et1.text.toString().length.equals(0)) {
                Toast.makeText(this, "El nombre de usuario no debe estar vacío.", Toast.LENGTH_LONG)
                    .show()
            } else if (et2.text.toString().length.equals(0)) {
                Toast.makeText(this, "La contraseña no debe estar vacía.", Toast.LENGTH_LONG).show()
            }
        }
    }
}