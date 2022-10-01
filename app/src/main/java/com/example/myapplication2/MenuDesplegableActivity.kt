package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuDesplegableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_desplegable)

        val boton1 = findViewById<Button>(R.id.regresarmenu)
        boton1.setOnClickListener {
            val lanzar = Intent(this, MenuActivity::class.java)
            startActivity(lanzar)
        }
        val boton2 = findViewById<Button>(R.id.cambiarcontrasena)
        boton2.setOnClickListener {
            val lanzar = Intent(this, NuevaContrasenaActivity::class.java)
            startActivity(lanzar)
        }
    }
}