package com.example.mipaissoado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.CollapsibleActionView
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_auth.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_register_user.*
import java.nio.file.attribute.AclFileAttributeView


class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        Botonregister.setOnClickListener()
        {

            startActivity(Intent(this, RegisterUser::class.java))

        }

        setup()


    }



    private fun setup()
    {

        title = "Autenticación"

        Botonlogin.setOnClickListener()
        {
            if (PasswordEditText.text.isNotEmpty() && EmailEditText.text.isNotEmpty())
            {

                FirebaseAuth.getInstance().signInWithEmailAndPassword(EmailEditText.text.toString(),PasswordEditText.text.toString()).addOnCompleteListener()
                {

                    if (it.isSuccessful)
                    {
                        startActivity(Intent(this, PaginaPrincipal::class.java))
                    }

                    else
                    {
                        val builder = AlertDialog.Builder( this)
                        builder.setTitle("error")
                        builder.setMessage("Error de logeo! Creese una cuenta con el boton de Registrar!")
                        builder.setPositiveButton("aceptar", null)
                        val dialog: AlertDialog = builder.create()
                        dialog.show()
                    }
                }

            }

        }



    }




}