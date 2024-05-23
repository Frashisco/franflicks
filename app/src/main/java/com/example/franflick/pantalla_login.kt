package com.example.franflick

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class pantalla_login : ComponentActivity() {

    // Método 'onCreate' que se llama cuando la actividad se crea por primera vez
    override fun onCreate(savedInstanceState: Bundle?) {
        // Establece el tema del splash screen
        setTheme(R.style.SplashTheme)

        // Llamada al método 'onCreate' de la clase base 'AppCompatActivity'
        super.onCreate(savedInstanceState)
        // Establece el diseño de la actividad utilizando el archivo XML 'login.xml'
        setContentView(R.layout.login)

        // Encuentra los elementos de la interfaz de usuario
        val usernameEditText = findViewById<EditText>(R.id.EmailAddress)
        val passwordEditText = findViewById<EditText>(R.id.Password)
        val btnAceptarL: Button = findViewById(R.id.boton_aceptarL)

        // Establece un listener cuando se clica el botón 'btnAceptarL'
        btnAceptarL.setOnClickListener {
            // Obtiene los valores introducidos por el usuario
            val inputEmail = usernameEditText.text.toString()
            val inputPassword = passwordEditText.text.toString()

            // Obtiene los valores guardados en SharedPreferences
            val sharedPreferences = getSharedPreferences("userPrefs", MODE_PRIVATE)
            val savedEmail = sharedPreferences.getString("email", "francisco@gmail.com")
            val savedPassword = sharedPreferences.getString("password", "usuario")

            // Verifica si el correo y la contraseña son correctos
            if (inputEmail == savedEmail && inputPassword == savedPassword) {
                // Si las credenciales son correctas, muestra un mensaje y navega a la pantalla principal
                Toast.makeText(this, "Inicio de Sesión correcto", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, pantalla_pagina_principal::class.java)
                startActivity(intent)
                finish()
            } else {
                // Si las credenciales son incorrectas, navega a la pantalla de error
                val intent = Intent(this, pantalla_error::class.java)
                startActivity(intent)
            }
        }

        // Encuentra el botón para ir a la pantalla de registro
        val btnRegsitrarseL: Button = findViewById(R.id.boton_registrarse)
        btnRegsitrarseL.setOnClickListener {
            val intent = Intent(this, pantalla_registrarse::class.java)
            startActivity(intent)
        }
    }
}