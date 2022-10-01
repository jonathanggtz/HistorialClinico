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
        val boton2=findViewById<Button>(R.id.menu_desplegable)
        boton2.setOnClickListener {
            val lanzar = Intent (this, MenuDesplegableActivity::class.java)
            startActivity(lanzar)
        }
        val boton3=findViewById<Button>(R.id.historialclinico)
        boton3.setOnClickListener {
            val lanzar = Intent (this, HistorialClinicoActivity::class.java)
            startActivity(lanzar)
        }
        val boton4=findViewById<Button>(R.id.bitacoraglucosa)
        boton4.setOnClickListener {
            val lanzar = Intent (this, BitacoraGlucosaActivity::class.java)
            startActivity(lanzar)
        }

    }
}