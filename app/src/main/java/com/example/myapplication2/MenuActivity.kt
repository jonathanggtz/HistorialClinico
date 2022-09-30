package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val boton1=findViewById<Button>(R.id.alarmas)
        boton1.setOnClickListener {
            val lanzar = Intent (this, ConfiguracionNotificacionesActivity::class.java)
            startActivity(lanzar)
        }
    }
}