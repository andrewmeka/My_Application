package com.andrew.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profileactivity : AppCompatActivity() {

    private lateinit var homeButton: Button
    


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profileactivity)

        homeButton = findViewById(R.id.homeButton)

    }
}