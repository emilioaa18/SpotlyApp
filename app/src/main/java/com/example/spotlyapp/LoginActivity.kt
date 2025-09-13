package com.example.spotlyapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.spotlyapp.RegisterActivity


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUser = findViewById<EditText>(R.id.etUser)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)


        btnLogin.setOnClickListener {
            val user = etUser.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (user.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor llena todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                if (password == "1234") {
                    val intent = Intent(this, HomeActivity::class.java)
                    intent.putExtra("USERNAME", user)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
                }
            }
        }

        btnRegister.setOnClickListener { navigatetoRegister()}
    }
}

private fun LoginActivity.navigatetoRegister(){

    val intent = Intent(this, RegisterActivity::class.java)
    startActivity(intent)
}