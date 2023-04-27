package com.example.pdf_scanner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            try {
                // Navigate to the main app flow
                val intent = Intent(this, OnBoarding::class.java)
                startActivity(intent)
                finish()
            } catch (e: Exception) {
                // Handle any exceptions that occur during navigation

            }
        }, 2000)
    }
}
