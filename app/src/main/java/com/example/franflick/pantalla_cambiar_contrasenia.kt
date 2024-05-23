package com.example.franflick

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class pantalla_cambiar_contrasenia: ComponentActivity() {

    // Método 'onCreate' que se llama cuando la actividad se crea por primera vez
    override fun onCreate(savedInstanceState: Bundle?) {
        // Llamada al método 'onCreate' de la clase base 'AppCompatActivity'
        super.onCreate(savedInstanceState)
        // Establece el diseño de la actividad utilizando el archivo XML 'cambio_contrasenia.xml'
        setContentView(R.layout.cambio_contrasenia)

        // Encuentra los elementos de la interfaz de usuario
        val btnAtrasCC: Button = findViewById(R.id.boton_atrasCC)
        val btnAceptarCC: Button = findViewById(R.id.boton_aceptarCC)
        val currentPasswordEditText: EditText = findViewById(R.id.Contrasenia_actual)
        val newPasswordEditText: EditText = findViewById(R.id.contrasenia_nueva)
        val repeatNewPasswordEditText: EditText = findViewById(R.id.repetir_contrasenia)

        // Configura el botón "Atrás"
        btnAtrasCC.setOnClickListener {
            // Navega a la pantalla de configuración
            val intent = Intent(this, pantalla_configuracion::class.java)
            startActivity(intent)
        }

        // Configura el botón "Aceptar"
        btnAceptarCC.setOnClickListener {
            // Obtiene los valores introducidos por el usuario
            val currentPassword = currentPasswordEditText.text.toString()
            val newPassword = newPasswordEditText.text.toString()
            val repeatNewPassword = repeatNewPasswordEditText.text.toString()

            // Obtiene la contraseña guardada en SharedPreferences
            val sharedPreferences = getSharedPreferences("userPrefs", MODE_PRIVATE)
            val savedPassword = sharedPreferences.getString("password", "usuario")

            // Verifica si la contraseña actual es correcta
            if (currentPassword == savedPassword) {
                // Verifica si las nuevas contraseñas coinciden
                if (newPassword == repeatNewPassword) {
                    // Guarda la nueva contraseña en SharedPreferences
                    val editor = sharedPreferences.edit()
                    editor.putString("password", newPassword)
                    editor.apply()

                    // Muestra un mensaje y navega a la pantalla de configuración
                    Toast.makeText(this, "Contraseña cambiada exitosamente", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, pantalla_configuracion::class.java)
                    startActivity(intent)
                } else {
                    // Muestra un mensaje si las nuevas contraseñas no coinciden
                    Toast.makeText(this, "Las contraseñas nuevas no coinciden", Toast.LENGTH_SHORT).show()
                }
            } else {
                // Muestra un mensaje si la contraseña actual es incorrecta
                Toast.makeText(this, "Contraseña actual incorrecta", Toast.LENGTH_SHORT).show()
            }
        }
    }
}