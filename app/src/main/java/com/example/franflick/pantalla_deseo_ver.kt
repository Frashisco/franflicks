package com.example.franflick

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class pantalla_deseo_ver: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Llamada al método 'onCreate' de la clase base 'AppCompatActivity'
        super.onCreate(savedInstanceState)
        // Establece el diseño de la actividad utilizando el archivo XML 'deseo_ver.xml'
        setContentView(R.layout.deseo_ver)

        // Encuentra el botón con el ID 'boton_atrasdeseo' en el diseño y lo asigna a 'btnAtrasDeseoVer'
        val btnAtrasDeseoVer: Button = findViewById(R.id.boton_atrasdeseo)
        // Establece un listener cuando se clika el botón 'btnAtrasDeseoVer'
        btnAtrasDeseoVer.setOnClickListener {
            // Crea un Intent para iniciar 'pantalla_listas'
            val intent: Intent = Intent(this, pantalla_listas::class.java)
            // Inicia la actividad especificada por el Intent
            startActivity(intent)
        }
    }
}