package com.example.mipaissoado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class Norteamerica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.norteamerica)

        val arrayAdapter:ArrayAdapter<*>
        val paises = mutableListOf("México", "Estados Unidos", "Canadá", "Groenlandia", "Cuba", "Panamá", "Jamaica", "Haití", "Guatemala",
                            "Costa Rica", "Republica Dominicana", "Honduras", "Puerto Rico", "Belice", "Bahamas", "Barbados", "Martinica",
                            "Nicaragua", "San Vicente y las Granadinas", "Montserrat", "Islas Vírgenes de los Estados Unidos", "Antigua y Barbuda",
                        "Islas Caimán", "Guadalupe", "Santa Lucía", "Dominica", "El Salvador", "San Pedro y Miquelón", "San Bartolomé", "Granada",
                        "Islas Turcas y Caicos", "San Cristóbal y Nieves", "Islas Vírgenes Británicas", "Anguilla", "Sint Maarten", "San Martin")

        val PNortAm = findViewById<ListView>(R. id.PNortAm )

        arrayAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1, paises)
        PNortAm.adapter = arrayAdapter
        PNortAm.setOnItemClickListener(){parent,view,position,id->

            Toast.makeText(this,parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show()

        }


    }
}