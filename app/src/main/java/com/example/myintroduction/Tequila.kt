package com.example.myintroduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Tequila : AppCompatActivity() {

    private val backButton: View by lazy { findViewById(R.id.backButton) }
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tequila)
        count = intent.getIntExtra("count", 0)


        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("count", count)
            startActivity(intent)
            finish() // Close the current activity
        }
    }
}