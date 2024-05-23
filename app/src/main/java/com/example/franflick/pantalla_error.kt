package com.example.franflick

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class pantalla_error: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // Llamada al método 'onCreate' de la clase base 'AppCompatActivity'
        super.onCreate(savedInstanceState)
        // Establece el diseño de la actividad utilizando el archivo XML 'fallo_rellenar_campos.xml'
        setContentView(R.layout.fallo_rellenar_campos)

        // Encuentra el botón con el ID 'boton_aceptarE' en el diseño y lo asigna a 'btnAceptarFallo'
        val btnAceptarFallo: Button = findViewById(R.id.boton_aceptarE)
        // Establece un listener cuando se clika el botón 'btnAceptarFallo'
        btnAceptarFallo.setOnClickListener {
            // Crea un Intent para iniciar 'pantalla_login'
            val intent: Intent = Intent(this, pantalla_pagina_principal::class.java)
            // Inicia la actividad especificada por el Intent
            startActivity(intent)
        }
    }
}