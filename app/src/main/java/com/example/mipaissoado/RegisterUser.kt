package com.example.mipaissoado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_auth.*
import kotlinx.android.synthetic.main.activity_register_user.*


class RegisterUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        //setup

        setup()
    }


    private fun setup()
    {

        title = "Autenticación"

        ButtonAuthRegister.setOnClickListener()
        {
            if (TextoContraseña.text.isNotEmpty() && TextoEmail.text.isNotEmpty())
            {

                FirebaseAuth.getInstance().createUserWithEmailAndPassword(TextoEmail.text.toString(),TextoContraseña.text.toString()).addOnCompleteListener(){

                    if (it.isSuccessful)
                    {
                        val builder = AlertDialog.Builder( this)
                        builder.setTitle("Registrado!")
                        builder.setMessage("Usted se ha registrado Correctamente!")
                        builder.setPositiveButton("aceptar", null)
                        val dialog: AlertDialog = builder.create()
                        dialog.show()
                        startActivity(Intent(this, AuthActivity::class.java))
                    }

                    else
                    {
                        val builder = AlertDialog.Builder( this)
                        builder.setTitle("error")
                        builder.setMessage("Se ha producido un error, intentelo denuevo")
                        builder.setPositiveButton("aceptar", null)
                        val dialog: AlertDialog = builder.create()
                        dialog.show()
                    }

                }

            }

        }



    }



}