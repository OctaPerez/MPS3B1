package com.example.mipaissoado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_europa.*

class Europa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_europa)

        val arrayAdapter3: ArrayAdapter<*>
        val paisese = mutableListOf("Albania","Alemania", "Andorra", "Armenia", "Austria", "Azerbaiyán", "Bélgica",
            "Bielorrusia", "Bosnia y Herzegovina", "Bulgaria", "Chipre", "Ciudad del Vaticano", "Croacia","Dinamarca",
            "Eslovaquia", "Eslovenia", "España", "Estonia", "Finlandia", "Francia", "Georgia", "Grecia", "Hungría",
            "Irlanda", "Islandia", "Italia", "Kazajistán", "Letonia", "Liechtenstein", "Lituania", "Luxemburgo",
            "Macedonia del Norte", "Malta", "Moldavia", "Mónaco", "Montenegro", "Noruega", "Países Bajos",
            "Polonia", "Portugal", "Reino Unido", "República Checa", "Rumanía", "Rusia", "San Marino",
            "Serbia", "Suecia", "Suiza", "Turquía", "Ucrania")

        val PEu= findViewById<ListView>(R.id.PE)

        arrayAdapter3 = ArrayAdapter(this, android.R.layout.simple_list_item_1, paisese)
        PE.adapter = arrayAdapter3
        PE.setOnItemClickListener() { parent, view, position, id ->

            Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show()
        }
    }
}