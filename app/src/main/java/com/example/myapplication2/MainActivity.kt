package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val boton:Button = findViewById(R.id.tvbuttonNavegar)

        boton.setOnClickListener { view ->
            val intent = Intent(this, SegundaActivity::class.java).apply{
                putExtra("Nombre", "David");
                putExtra("Apellidos", "Hoyas Navarro");
                putExtra("edad", 19);
            }
            startActivity(intent)

        }

    }

}