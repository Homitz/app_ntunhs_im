package com.example.hw05

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnChangeActivity = findViewById<Button>(R.id.btnChangeActivity)
        val btnOpenBrower = findViewById<Button>(R.id.btnOpenBrower)

        btnChangeActivity.setOnClickListener{
            var seconIntent = Intent( this,SecondActivity::class.java)
            startActivity(seconIntent)
        }

        btnOpenBrower.setOnClickListener{
            var seconIntent = Intent( this,ThirdActivity::class.java)
            startActivity(seconIntent)
        }
    }
}