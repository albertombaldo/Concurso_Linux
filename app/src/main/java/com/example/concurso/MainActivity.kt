package com.example.concurso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nombreUsuario(view : View){
        val editText = findViewById<EditText>(R.id.editTextTextPersonName2)
        val nombre = editText.text.toString()
        if(nombre != ""){
            val intent = Intent(this, Radio::class.java).apply {
                putExtra("usuario",nombre )
            }
            startActivity(intent)
        }
        else{
            Toast.makeText(this, "Introduzca un nombre de usuario", Toast.LENGTH_SHORT)
                .show()
        }


    }
}