package com.example.mipaissoado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast


class Sudamerica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sudamerica)

        val arrayAdapter1: ArrayAdapter<*>
        val paisessa = mutableListOf("Argentina","Bolivia", "Brasil", "Chile","Colombia","Ecuador", "Guyana",
                                    "Paraguay", "Perú", "Surinam", "Trinidad y Tobago", "Uruguay", "Venezuela")

        val PSudAm = findViewById<ListView>(R.id.PSudAm)

        arrayAdapter1 = ArrayAdapter(this, android.R.layout.simple_list_item_1, paisessa)
        PSudAm.adapter = arrayAdapter1
        PSudAm.setOnItemClickListener() { parent, view, position, id ->

            Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show()

        }

        PSudAm.adapter




    }
}