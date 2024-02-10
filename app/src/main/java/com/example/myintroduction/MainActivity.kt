package com.example.myintroduction

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var digitCount: TextView
    private lateinit var minusBtn: Button
    private lateinit var plusBtn: Button
    private lateinit var resetBtn: Button
    private lateinit var meBtn: Button
    private lateinit var navyBtn: Button
    private lateinit var tequilaBtn: Button

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        digitCount = findViewById(R.id.digitCount)

        val intent = intent
        count = if (intent != null && intent.hasExtra("count")) {
            intent.getIntExtra("count", 0)
        } else {
            0
        }

        minusBtn = findViewById(R.id.minusBtn)
        plusBtn = findViewById(R.id.plusBtn)
        resetBtn = findViewById(R.id.resetBtn)
        meBtn = findViewById(R.id.meButton)
        navyBtn = findViewById(R.id.navyButton)
        tequilaBtn = findViewById(R.id.myDogButton)

        digitCount.text = count.toString()

        minusBtn.setOnClickListener {
            decrementCount(it)
        }
        plusBtn.setOnClickListener {
            incrementCount(it)
        }
        resetBtn.setOnClickListener {
            resetCount(it)
        }
        meBtn.setOnClickListener {
            openMeActivity(it)
        }
        navyBtn.setOnClickListener {
            openNavyActivity(it)
        }
        tequilaBtn.setOnClickListener {
            openTequilaActivity(it)
        }

    }

    private fun incrementCount(view: View) {
        count++
        digitCount.text = count.toString()
    }

    private fun decrementCount(view: View) {
        count--
        digitCount.text = count.toString()
    }

    private fun resetCount(view: View) {
        count = 0
        digitCount.text = count.toString()
    }

    fun openMeActivity(view: View) {
        val intent = Intent(this, Me::class.java)
        intent.putExtra("count", count)
        startActivity(intent)
    }

    fun openNavyActivity(view: View) {
        val intent = Intent(this, Navy::class.java)
        intent.putExtra("count", count)
        startActivity(intent)
    }

    fun openTequilaActivity(view: View) {
        val intent = Intent(this, Tequila::class.java)
        intent.putExtra("count", count)
        startActivity(intent)
    }
}