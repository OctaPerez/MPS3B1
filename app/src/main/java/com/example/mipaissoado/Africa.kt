package com.example.mipaissoado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_europa.*

class Africa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_africa)

        val arrayAdapter4: ArrayAdapter<*>
        val paisesaf = mutableListOf("Angola", "Argelia", "Benín", "Botsuana", "Burkina Faso",
                    "Burundi", "Cabo Verde", "Camerún", "Chad", "Comoras", "Costa de Marfil", "Egipto",
                    "Eritrea", "Etiopía", "Gabón", "Gambia", "Ghana", "Guinea", "Guinea-Bisáu", "Guinea Ecuatorial",
                    "Kenia", "Lesoto", "Liberia", "Libia", "Madagascar", "Malaui", "Malí", "Mauricio", "Mauritania",
                    "Mozambique", "Namibia", "Níger", "Nigeria", "República Centroafricana", "República del Congo",
                    "República Democrática del Congo", "Ruanda", "Santo Tomé y Príncipe", "Senegal", "Seychelles",
                    "Sierra Leona", "Somalia", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Tanzania",
                    "Togo", "Túnez", "Uganda", "Yibuti", "Zambia", "Zimbabue")

        val PAf= findViewById<ListView>(R.id.PAf)

        arrayAdapter4 = ArrayAdapter(this, android.R.layout.simple_list_item_1, paisesaf)
        PAf.adapter = arrayAdapter4
        PAf.setOnItemClickListener() { parent, view, position, id ->

            Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show()
        }
    }
}