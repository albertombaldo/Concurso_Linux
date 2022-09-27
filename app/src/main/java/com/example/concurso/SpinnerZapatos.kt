package com.example.concurso

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class SpinnerZapatos : AppCompatActivity() {
    private var opciones: Spinner?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_zapatos)
        //Cambio de página
        val btn: Button = findViewById(R.id.button4)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, PantallaFinal:: class.java)
            startActivity(intent)
        }

        //Spinner
        opciones = findViewById(R.id.spinner)
        val calzado= arrayOf("Seleccione un calzado","Botas","Sneakers","Zapato")
        var adaptador: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_spinner_item,calzado)
        opciones?.adapter=adaptador
    }
}

/*
class MainActivity : AppCompatActivity() {
    private var spLenguajes:Spinner?=null
    private var tvSeleccion:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spLenguajes=findViewById(R.id.spLenguajes)
        tvSeleccion=findViewById(R.id.tvSeleccion)
        val listaLenguajes= arrayOf("Seleccione un lenguaje","Kotlin","Java","C++","PHP")
        var adaptador:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_spinner_item,listaLenguajes)
        spLenguajes?.adapter=adaptador
        spLenguajes?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(position>0){
                    tvSeleccion?.text="Seleccionaste "+spLenguajes?.getSelectedItem().toString()
                }else{
                    tvSeleccion?.text="No haz seleccionado ningun lenguaje de programacion"
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                tvSeleccion?.text="No haz seleccionado ningun lenguaje de programacion"
            }
        }
    }
}
 */