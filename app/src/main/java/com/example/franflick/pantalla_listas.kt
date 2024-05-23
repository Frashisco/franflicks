package com.example.franflick

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class pantalla_listas: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // Llamada al método 'onCreate' de la clase base 'AppCompatActivity'
        super.onCreate(savedInstanceState)
        // Establece el diseño de la actividad utilizando el archivo XML 'lista.xml'
        setContentView(R.layout.lista)

        // Encuentra el botón con el ID 'boton_atrasListas' en el diseño y lo asigna a 'btnAtrasListas'
        val btnAtrasListas: Button = findViewById(R.id.boton_atrasListas)
        // Establece un listener cuando se clika el botón 'btnAtrasListas'
        btnAtrasListas.setOnClickListener {
            // Crea un Intent para iniciar 'pantalla_pagina_principal'
            val intent: Intent = Intent(this, pantalla_pagina_principal::class.java)
            // Inicia la actividad especificada por el Intent
            startActivity(intent)
        }

        // Encuentra el botón con el ID 'boton_lista_vistas' en el diseño y lo asigna a 'btnListaVistas'
        val btnListaVistas: Button = findViewById(R.id.boton_lista_vistas)
        // Establece un listener cuando se clika el botón 'btnConfiguracion'
        btnListaVistas.setOnClickListener {
            // Crea un Intent para iniciar 'pantalla_vistas'
            val intent: Intent = Intent(this, pantalla_vistas::class.java)
            // Inicia la actividad especificada por el Intent
            startActivity(intent)
        }

        // Encuentra el botón con el ID 'boton_lista_deseo_ver' en el diseño y lo asigna a 'btnListaDeseo_ver'
        val btnListaDeseo_ver: Button = findViewById(R.id.boton_lista_deseo_ver)
        // Establece un listener cuando se clika el botón 'btnListaDeseo_ver'
        btnListaDeseo_ver.setOnClickListener {
            // Crea un Intent para iniciar 'pantalla_deseo_ver'
            val intent: Intent = Intent(this, pantalla_deseo_ver::class.java)
            // Inicia la actividad especificada por el Intent
            startActivity(intent)
        }



    }
}