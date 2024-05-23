package com.example.franflick

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class pantalla_vistas: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // Llamada al método 'onCreate' de la clase base 'AppCompatActivity'
        super.onCreate(savedInstanceState)
        // Establece el diseño de la actividad utilizando el archivo XML 'peliculas_vistas.xml'
        setContentView(R.layout.peliculas_vistas)

        // Encuentra el botón con el ID 'boton_atrasVisto' en el diseño y lo asigna a 'btnAtrasVisto'
        val btnAtrasVisto: Button = findViewById(R.id.boton_atrasVisto)
        // Establece un listener cuando se clika el botón 'btnAtrasVisto'
        btnAtrasVisto.setOnClickListener {
            // Crea un Intent para iniciar 'pantalla_listas'
            val intent: Intent = Intent(this, pantalla_listas::class.java)
            // Inicia la actividad especificada por el Intent
            startActivity(intent)
        }
    }
}