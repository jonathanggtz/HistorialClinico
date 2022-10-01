package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NuevaContrasenaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_contrasena)

        val boton1 = findViewById<Button>(R.id.regresarmenudesplegable)
        boton1.setOnClickListener {
            val lanzar = Intent(this, MenuDesplegableActivity::class.java)
            startActivity(lanzar)
        }
    }
}