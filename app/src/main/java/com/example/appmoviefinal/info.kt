package com.example.appmoviefinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val secondActbutton = findViewById<Button>(R.id.button8)
        val thirdActbutton = findViewById<Button>(R.id.button9)
        val fourActbutton = findViewById<Button>(R.id.button10)
        val fiveActbutton = findViewById<Button>(R.id.button11)


        secondActbutton.setOnClickListener {
            val Intent = Intent(this,dune::class.java)
            startActivity(Intent)
        }

        thirdActbutton.setOnClickListener {
            val Intent = Intent(this,para::class.java)
            startActivity(Intent)
        }

        fourActbutton.setOnClickListener {
            val Intent = Intent(this,panther::class.java)
            startActivity(Intent)
        }

        fiveActbutton.setOnClickListener {
            val Intent = Intent(this,getout::class.java)
            startActivity(Intent)
        }
    }
}