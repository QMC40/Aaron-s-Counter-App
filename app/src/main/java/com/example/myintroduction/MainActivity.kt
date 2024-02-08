package com.example.myintroduction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
