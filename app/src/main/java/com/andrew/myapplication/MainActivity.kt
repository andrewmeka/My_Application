package com.andrew.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

var username = "admin"
    var password = "admin"

    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var submitButton: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R. id.usernameimput)
        passwordInput = findViewById(R. id.passwordimput)
        submitButton = findViewById(R.id. submitButton)

        submitButton.setOnClickListener {
            val username = usernameInput.text.toString()

            login(username, password)
        }
    }
    private fun login(username: String, password: String){
        if (isValidCredential(username, password)){
            val intent:Intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("name", username)

        }else{
            Toast.makeText(applicationContext, "something went wrong", Toast.LENGTH_SHORT).show()
        }

    }

    private fun isValidCredential(username: String, password: String): Boolean{
        if(username == this.username && password == this.password) return true
        return false
    }
}