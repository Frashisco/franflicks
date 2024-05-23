package com.example.franflick

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class pantalla_ayudas: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // Llamada al método 'onCreate' de la clase base 'AppCompatActivity'
        super.onCreate(savedInstanceState)
        // Establece el diseño de la actividad utilizando el archivo XML 'pagina_ayudas.xml'
        setContentView(R.layout.pagina_ayudas)

        // Encuentra el botón con el ID 'boton_atrasVisto' en el diseño y lo asigna a 'btnAtrasAyudas'
        val btnAtrasAyudas: Button = findViewById(R.id.boton_atrasAyudas)
        // Establece un listener cuando se clika el botón 'btnAtrasVisto'
        btnAtrasAyudas.setOnClickListener {
            // Crea un Intent para iniciar 'pantalla_pagina_principal'
            val intent: Intent = Intent(this, pantalla_pagina_principal::class.java)
            // Inicia la actividad especificada por el Intent
            startActivity(intent)
        }
    }
}