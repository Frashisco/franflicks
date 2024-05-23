package com.example.franflick

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class pantalla_configuracion : ComponentActivity() {

    // Método 'onCreate' que se llama cuando la actividad se crea por primera vez
    override fun onCreate(savedInstanceState: Bundle?) {
        // Llamada al método 'onCreate' de la clase base 'AppCompatActivity'
        super.onCreate(savedInstanceState)
        // Establece el diseño de la actividad utilizando el archivo XML 'configuracion.xml'
        setContentView(R.layout.configuracion)

        // Obtiene el nombre de usuario guardado en SharedPreferences
        val sharedPreferences = getSharedPreferences("userPrefs", MODE_PRIVATE)
        val username = sharedPreferences.getString("username", "Francisco Ruiz Paredes")

        // Muestra el nombre de usuario en un TextView
        val usernameTextView: TextView = findViewById(R.id.texto_nombre_cliente)
        usernameTextView.text = username

        // Encuentra el botón "Atrás" y establece un listener
        val btnAtrasConf: Button = findViewById(R.id.boton_atrasConf)
        btnAtrasConf.setOnClickListener {
            // Navega a la pantalla principal
            val intent = Intent(this, pantalla_pagina_principal::class.java)
            startActivity(intent)
        }

        // Encuentra el botón "Cambiar Contraseña" y establece un listener
        val btnCambiarContrasenia: Button = findViewById(R.id.boton_cambiar_contrasenia)
        btnCambiarContrasenia.setOnClickListener {
            // Navega a la pantalla de cambio de contraseña
            val intent = Intent(this, pantalla_cambiar_contrasenia::class.java)
            startActivity(intent)
        }

        // Encuentra el botón "Cerrar Sesión" y establece un listener
        val btnCerrarSesion: Button = findViewById(R.id.boton_cerrar_sesion)
        btnCerrarSesion.setOnClickListener {
            // Navega a la pantalla de login
            val intent = Intent(this, pantalla_login::class.java)
            startActivity(intent)
        }
    }
}