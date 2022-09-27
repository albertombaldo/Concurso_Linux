package com.example.concurso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class CheckBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
    }

    fun opcionesCheckBox() : String {

        var palabra : String
        var boton1 = findViewById<CheckBox>(R.id.checkBox)
        if(boton1.isChecked){
            palabra = "Camiseta"
            return palabra
        }
        else{
            boton1 = findViewById<CheckBox>(R.id.checkBox2)
            if(boton1.isChecked){
                palabra = "Polo"
                return palabra
            }else {
                boton1 = findViewById<CheckBox>(R.id.checkBox3)
                if (boton1.isChecked) {
                    palabra = "Camisa"
                    return palabra
                }
            }
        }
        return ""
    }
    fun siguientePantalla3(view: View) {
        var boton1 = findViewById<CheckBox>(R.id.checkBox)
        var boton2 = findViewById<CheckBox>(R.id.checkBox2)
        var boton3 = findViewById<CheckBox>(R.id.checkBox3)
        if(boton1.isChecked && boton2.isChecked || boton1.isChecked && boton3.isChecked || boton3.isChecked && boton2.isChecked || boton1.isChecked && boton2.isChecked && boton3.isChecked ) {
            Toast.makeText(this, "Introduzca solo una opcion por favor", Toast.LENGTH_SHORT)
                .show()
        }
        else{
            val intent = Intent(this, SpinnerZapatos::class.java).apply {
                val nombre = intent.getStringExtra("usuario")
                val eleccion1 = intent.getStringExtra("eleccion")
                putExtra("usuario", nombre)
                putExtra("eleccion", eleccion1)
                putExtra("eleccion2", opcionesCheckBox())
            }
            startActivity(intent)
        }


    }
}