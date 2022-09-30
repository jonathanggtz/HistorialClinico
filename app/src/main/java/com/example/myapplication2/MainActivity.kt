package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private val Unit.java: Unit
    get() {}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Funcion para pasar de una activity a otra
        val boton1=findViewById<Button>(R.id.botonabienvenido)
        boton1.setOnClickListener {
            val lanzar = Intent (this, BienvenidoActivity::class.java)
            startActivity(lanzar)
        }
    }
}
