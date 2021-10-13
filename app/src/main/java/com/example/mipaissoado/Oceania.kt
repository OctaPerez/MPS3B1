package com.example.mipaissoado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class Oceania : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oceania)

        val arrayAdapter5: ArrayAdapter<*>
        val paiseso = mutableListOf("Australia", "Fiyi", "Islas Marshall", "Islas Salomón",
                "Kiribati", "Micronesia", "Nauru", "Nueva Zelanda", "Palaos", "Papúa Nueva Guinea",
                "Samoa", "Tonga", "Tuvalu", "Vanuatu")

        val PaOc= findViewById<ListView>(R.id.PaOc)

        arrayAdapter5 = ArrayAdapter(this, android.R.layout.simple_list_item_1, paiseso)
        PaOc.adapter = arrayAdapter5
        PaOc.setOnItemClickListener() { parent, view, position, id ->

            Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show()
        }
    }
}