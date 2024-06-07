package com.example.appmoviefinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge

class splashscreen : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splashscreen)
        android.os.Handler().postDelayed({
            startActivity(Intent(this,loginpag::class.java))
            finish()
        }, SPLASH_TIME_OUT)

    }
}