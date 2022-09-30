package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BienvenidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)

        //Funcion para pasar de una activity a otra
        val boton1=findViewById<Button>(R.id.btnIntentToRegistrarseActivity)
        boton1.setOnClickListener {
            val lanzar = Intent (this, RegistrarseActivity::class.java)
            startActivity(lanzar)
        }
        val boton2=findViewById<Button>(R.id.botonabienvenido)
        boton2.setOnClickListener {
            val lanzar = Intent (this, MenuActivity::class.java)
            startActivity(lanzar)
    }
}
}