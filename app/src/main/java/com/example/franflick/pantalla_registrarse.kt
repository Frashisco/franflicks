package com.example.franflick

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class pantalla_registrarse : ComponentActivity() {

    // Método 'onCreate' que se llama cuando la actividad se crea por primera vez
    override fun onCreate(savedInstanceState: Bundle?) {
        // Llamada al método 'onCreate' de la clase base 'AppCompatActivity'
        super.onCreate(savedInstanceState)
        // Establece el diseño de la actividad utilizando el archivo XML 'registrarse.xml'
        setContentView(R.layout.registrarse)

        // Encuentra los elementos de la interfaz de usuario
        val btnAceptarR: Button = findViewById(R.id.boton_aceptarR)
        val usernameEditText: EditText = findViewById(R.id.nombre_completo)
        val emailEditText: EditText = findViewById(R.id.EmailAddress)
        val passwordEditText: EditText = findViewById(R.id.Password)

        // Establece un listener para el botón de registro
        btnAceptarR.setOnClickListener {
            // Obtiene los valores de los campos de texto
            val username = usernameEditText.text.toString().ifEmpty { "Francisco Ruiz Paredes" }
            val email = emailEditText.text.toString().ifEmpty { "francisco@gmail.com" }
            val password = passwordEditText.text.toString().ifEmpty { "usuario" }

            // Guarda los valores en SharedPreferences
            val sharedPreferences = getSharedPreferences("userPrefs", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putString("username", username)
            editor.putString("email", email)
            editor.putString("password", password)
            editor.apply()

            // Inicia la pantalla de login
            val intent = Intent(this, pantalla_login::class.java)
            startActivity(intent)
        }

        // Encuentra el botón para ir a la pantalla de inicio de sesión
        val btnRegsitrarseR: Button = findViewById(R.id.boton_inicio_sesion)
        btnRegsitrarseR.setOnClickListener {
            val intent = Intent(this, pantalla_login::class.java)
            startActivity(intent)
        }
    }
}