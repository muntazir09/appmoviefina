package com.example.appmoviefinal

import android.content.Intent
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1= findViewById<Button>(R.id.fit)
        val button2=findViewById<Button>(R.id.shit)
        val button3=findViewById<Button>(R.id.button12)

        button1.setOnClickListener {
            val intent= Intent(this,fav::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent= Intent(this,general::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent=Intent(this,info::class.java)
            startActivity(intent)
        }
    }
}