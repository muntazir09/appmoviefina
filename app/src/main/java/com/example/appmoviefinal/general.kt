package com.example.appmoviefinal

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class general : AppCompatActivity() {

    lateinit var button: Button
    lateinit var button5: Button
    lateinit var button6: Button
    lateinit var button7: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general)

        button = findViewById(R.id.button)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)

        button.setOnClickListener {
            openUrl("https://www.youtube.com/watch?v=YoHD9XEInc0")
        }

        button5.setOnClickListener {
            openUrl("https://www.youtube.com/watch?v=V75dMMIW2B4")
        }

        button6.setOnClickListener {
            openUrl("https://www.youtube.com/watch?v=Mj9IA9tTfio")
        }

        button7.setOnClickListener {
            openUrl("https://www.youtube.com/watch?v=gG22XNhtnoY")
        }
    }

        private fun openUrl(url: String) {
            if (url.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)
            }
        }
    }