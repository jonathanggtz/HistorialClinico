package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConfiguracionNotificacionesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion_notificaciones)

        val boton1=findViewById<Button>(R.id.continuarnotificaciones)
        boton1.setOnClickListener {
            val lanzar = Intent (this, AlarmasActivity::class.java)
            startActivity(lanzar)
        }
    }
}