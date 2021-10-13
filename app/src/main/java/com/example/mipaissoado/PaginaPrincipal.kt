package com.example.mipaissoado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.paginaprincipal.*

class PaginaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.paginaprincipal)


        Btnnorteamerica.setOnClickListener(){
            startActivity(Intent(this, Norteamerica::class.java))
        }

        Btnsudamerica.setOnClickListener(){
            startActivity(Intent(this, Sudamerica::class.java))
        }

        Basia.setOnClickListener(){
            startActivity(Intent(this, Asia::class.java))
        }

        Bteuropa.setOnClickListener(){
            startActivity(Intent(this, Europa::class.java))
        }

        Bnafri.setOnClickListener(){
            startActivity(Intent(this, Africa::class.java))
        }

        Bnoce.setOnClickListener(){
            startActivity(Intent(this, Oceania::class.java))
        }


    }






    }


