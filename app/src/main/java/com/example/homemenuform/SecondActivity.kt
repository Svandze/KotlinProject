package com.example.homemenuform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.homemenuform.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar!!.title = "Segunda actividad"
        actionBar.setDisplayHomeAsUpEnabled(true)
        val message=intent.getStringExtra("EXTRA_MESSAGE")
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = "Bienvenido, "+message
        }


        binding.btn1.setOnClickListener{
            replaceFragment(Fragment1())
        }
        binding.btn2.setOnClickListener{
            replaceFragment(Fragment2())
        }
        binding.btn3.setOnClickListener{
            replaceFragment(Fragment3())
        }
        binding.btn4.setOnClickListener{
            replaceFragment(Fragment4())
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}