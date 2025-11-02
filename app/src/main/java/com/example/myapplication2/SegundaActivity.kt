package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda)

        val boton: Button = findViewById(R.id.tvNavegar)
        boton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val extras = intent.extras
        val name = extras?.getString("Nombre")
        val surname = extras?.getString("Apellidos")
        val age = extras?.getInt("edad")

        val tvNombre = findViewById<TextView>(R.id.tvName2)
        val tvApellidos = findViewById<TextView>(R.id.tvSurname2)
        val tvEdad = findViewById<TextView>(R.id.tvAge2)

        tvNombre.text = name
        tvApellidos.text = surname
        tvEdad.text = age.toString()
    }
}
