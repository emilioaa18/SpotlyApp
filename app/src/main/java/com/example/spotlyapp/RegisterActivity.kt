package com.example.spotlyapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etNewUser = findViewById<EditText>(R.id.etNewUser)
        val etNewPassword = findViewById<EditText>(R.id.etNewPassword)
        val btnCrearUsuario = findViewById<Button>(R.id.btnCrearUsuario)

        btnCrearUsuario.setOnClickListener {
            val user = etNewUser.text.toString().trim()
            val password = etNewPassword.text.toString().trim()

            if (user.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor llena todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Cuenta creada para $user", Toast.LENGTH_SHORT).show()
                navigatetoRegister()
            }


        }
        }
    }


private fun RegisterActivity.navigatetoRegister(){

    val intent = Intent(this, LoginActivity::class.java)
    startActivity(intent)
}
