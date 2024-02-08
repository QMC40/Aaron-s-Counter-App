package com.example.myintroduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var digitCount: TextView
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        digitCount = findViewById(R.id.digitCount)
        count = 0

    }

    fun incrementCount(view: View) {
        count++
        digitCount.text = count.toString()
    }

    fun decrementCount(view: View) {
        count--
        digitCount.text = count.toString()
    }

    fun resetCount(view: View) {
        count = 0
        digitCount.text = count.toString()
    }

    fun openMeActivity(view: View) {
        val intent = Intent(this, Me::class.java)
        startActivity(intent)
    }

    fun openNavyActivity(view: View) {
        val intent = Intent(this, Navy::class.java)
        startActivity(intent)
    }

    fun openTequilaActivity(view: View) {
        val intent = Intent(this, Tequila::class.java)
        startActivity(intent)
    }



}
