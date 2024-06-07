package com.example.appmoviefinal

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fav : AppCompatActivity() {

    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fav)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)

        button1.setOnClickListener {
            openUrl("https://www.youtube.com/watch?v=XY8amUImEu0")
        }

        button2.setOnClickListener {
            openUrl("https://www.youtube.com/watch?v=m8e-FF8MsqU")
        }

        button3.setOnClickListener {
            openUrl("https://www.youtube.com/watch?v=NtTkHu8R2_Q")
        }

        button4.setOnClickListener {
            openUrl("https://www.youtube.com/watch?v=GdYjwYLMO8s")
        }
    }

    // Function to open a URL in the browser
    private fun openUrl(url: String) {
        if (url.isNotEmpty()) {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        } else {
            // Handle the case where the URL is empty, if necessary
        }
    }
}
