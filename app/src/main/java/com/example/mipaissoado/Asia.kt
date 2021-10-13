package com.example.mipaissoado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class Asia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asia)

        val arrayAdapter2: ArrayAdapter<*>
        val paisesa = mutableListOf("Afganistán", "Arabia Saudita", "Armenia", "Azerbaiyán", "Bangladés", "Baréin",
                "Birmania / Myanmar", "Brunéi", "Bután", "Camboya", "Catar", "China", "Chipre", "Corea del Norte",
                    "Corea del Sur", "Emiratos Árabes Unidos", "Filipinas", "Georgia", "India", "Indonesia", "Irak",
                    "Irán", "Israel", "Japón","Jordania", "Kazajistán", "Kirguistán", "Kuwait", "Laos", "Líbano",
                    "Malasia", "Maldivas", "Mongolia", "Nepal", "Omán", "Pakistán", "Rusia", "Singapur", "Siria", "Sri Lanka",
                    "Tailandia", "Tayikistán", "Timor Oriental", "Turkmenistán", "Turquía", "Uzbekistán", "Vietnam", "Yemen")

        val PaAs= findViewById<ListView>(R.id.PaAs)

        arrayAdapter2 = ArrayAdapter(this, android.R.layout.simple_list_item_1, paisesa)
        PaAs.adapter = arrayAdapter2
        PaAs.setOnItemClickListener() { parent, view, position, id ->

            Toast.makeText(this, parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show()
        }


    }
}