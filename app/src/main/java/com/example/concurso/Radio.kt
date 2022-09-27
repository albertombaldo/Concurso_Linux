package com.example.concurso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class Radio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)
    }

    fun opcionesPantalon(): String {

        var palabra: String
        var boton1 = findViewById<RadioButton>(R.id.radioButton)

        if (boton1.isChecked) {
            palabra = "Ajustado"
            return palabra
        } else {
            boton1 = findViewById<RadioButton>(R.id.radioButton2)
            if (boton1.isChecked) {
                palabra = "Ancho"
                return palabra
            } else {
                boton1 = findViewById<RadioButton>(R.id.radioButton3)
                if (boton1.isChecked) {
                    palabra = "Regular"
                    return palabra
                }
            }
        }
        return ""
    }
    fun siguientePantalla(view: View) {

        val grupoRadio = findViewById<RadioGroup>(R.id.grupoPantalon)
        var id: Int = grupoRadio.checkedRadioButtonId
        if(id != -1) {
            val intent = Intent(this, CheckBox::class.java).apply {
                val nombre = intent.getStringExtra("usuario")
                putExtra("usuario", nombre)
                putExtra("eleccion", opcionesPantalon())
            }
            startActivity(intent)
        }else{
            Toast.makeText(this, "No has seleccionado ninguna opción", Toast.LENGTH_SHORT).show()
        }


    }
}