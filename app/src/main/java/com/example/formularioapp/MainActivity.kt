package com.example.formularioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton: Button = findViewById(R.id.submitButton)
        val editTextNombre: EditText = findViewById(R.id.editTextNombre)
        val editTextApellidos: EditText = findViewById(R.id.editTextApellidos)
        val editTextNroControl: EditText = findViewById(R.id.editTextNroControl)
        val editTextSemestre: EditText = findViewById(R.id.editTextSemestre)
        val editTextFechaNacimiento: EditText = findViewById(R.id.editTextFechaNacimiento)
        val editTextEdad: EditText = findViewById(R.id.editTextEdad)
        val editTextCarrera: EditText = findViewById(R.id.editTextCarrera)
        val editTextCorreo: EditText = findViewById(R.id.editTextCorreo)
        val editTextTelefono: EditText = findViewById(R.id.editTextTelefono)
        val editTextSexo: EditText = findViewById(R.id.editTextSexo)

        submitButton.setOnClickListener {
            // Validación básica
            if (editTextNombre.text.toString().isEmpty() ||
                editTextApellidos.text.toString().isEmpty() ||
                editTextNroControl.text.toString().isEmpty()) {
                Toast.makeText(this, "Por favor complete los campos obligatorios", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Crear intent para pasar a la siguiente actividad
            val intent = Intent(this, ResultadoActivity::class.java).apply {
                putExtra("nombre", editTextNombre.text.toString())
                putExtra("apellidos", editTextApellidos.text.toString())
                putExtra("nroControl", editTextNroControl.text.toString())
                putExtra("semestre", editTextSemestre.text.toString())
                putExtra("fechaNacimiento", editTextFechaNacimiento.text.toString())
                putExtra("edad", editTextEdad.text.toString())
                putExtra("carrera", editTextCarrera.text.toString())
                putExtra("correo", editTextCorreo.text.toString())
                putExtra("telefono", editTextTelefono.text.toString())
                putExtra("sexo", editTextSexo.text.toString())
            }
            startActivity(intent)
        }
    }
}