package com.example.formularioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Recuperar todos los datos del intent
        val nombre = intent.getStringExtra("nombre") ?: ""
        val apellidos = intent.getStringExtra("apellidos") ?: ""
        val nroControl = intent.getStringExtra("nroControl") ?: ""
        val semestre = intent.getStringExtra("semestre") ?: ""
        val fechaNacimiento = intent.getStringExtra("fechaNacimiento") ?: ""
        val edad = intent.getStringExtra("edad") ?: ""
        val carrera = intent.getStringExtra("carrera") ?: ""
        val correo = intent.getStringExtra("correo") ?: ""
        val telefono = intent.getStringExtra("telefono") ?: ""
        val sexo = intent.getStringExtra("sexo") ?: ""

        // Asignar los valores a los TextView
        findViewById<TextView>(R.id.textViewNombre).text = "Nombre: $nombre"
        findViewById<TextView>(R.id.textViewApellidos).text = "Apellidos: $apellidos"
        findViewById<TextView>(R.id.textViewNroControl).text = "Nro. de control: $nroControl"
        findViewById<TextView>(R.id.textViewSemestre).text = "Semestre: $semestre"
        findViewById<TextView>(R.id.textViewFechaNacimiento).text = "Fecha de nacimiento: $fechaNacimiento"
        findViewById<TextView>(R.id.textViewEdad).text = "Edad: $edad"
        findViewById<TextView>(R.id.textViewCarrera).text = "Carrera: $carrera"
        findViewById<TextView>(R.id.textViewCorreo).text = "Correo: $correo"
        findViewById<TextView>(R.id.textViewTelefono).text = "Teléfono: $telefono"
        findViewById<TextView>(R.id.textViewSexo).text = "Sexo: $sexo"

        // Botón para volver
        findViewById<Button>(R.id.buttonVolver).setOnClickListener {
            finish()
        }
    }
}