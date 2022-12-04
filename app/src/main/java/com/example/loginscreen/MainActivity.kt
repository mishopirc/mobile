package com.example.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val username = entUsername.text.toString().trim()
            val password = entPassword.text.toString().trim()

            if (username.isEmpty()){
                entUsername.error = "Enter username"
                entUsername.requestFocus()
            }else if(password.isEmpty()){
                entPassword.error = "Enter password"
                entPassword.requestFocus()
            }else{
                val intent = Intent(this,HomeActivity::class.java)
                startActivity(intent)
                finish()

            }

        }
    }

}

