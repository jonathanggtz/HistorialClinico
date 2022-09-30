package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrarseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)

        val boton1=findViewById<Button>(R.id.buttoncancelar)
        boton1.setOnClickListener {
            val lanzar = Intent (this, BienvenidoActivity::class.java)
            startActivity(lanzar)
        }
    }
}