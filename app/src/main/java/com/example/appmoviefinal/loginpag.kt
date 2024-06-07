package com.example.appmoviefinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class loginpag : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpag)

        val emailEditText=findViewById<EditText>(R.id.editTextTextEmailAddress)
        val logbut = findViewById<Button>(R.id.button13)
        val pass = findViewById<EditText>(R.id.pass)
        logbut.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = pass.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()){
                Toast.makeText(this,"Login Successful!", Toast.LENGTH_SHORT)

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

                finish()
            }else{
                Toast.makeText(this, "Please enter email and Password", Toast.LENGTH_SHORT).show()
            }
        }

    }
}