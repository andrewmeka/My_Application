package com.andrew.myapplication

import android.icu.number.NumberFormatter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private lateinit var  usernameDisplay: TextView
private lateinit var  profileButtone: Button

class HomeActivity : AppCompatActivity() {
    private lateinit var usernameDisplay: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        usernameDisplay.text = intent.getStringExtra("username")

        profileButtone.setOnClickListener {
            op
        }

        usernameDisplay= findViewById(R.id.usernameDisplay)

        usernameDisplay.text= intent.getStringExtra("name")
    }
}