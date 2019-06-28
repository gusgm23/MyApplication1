package com.example.myapplication1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularEdad(view:View){

        try {


            val añoDeNacimiento= txtAnioDeNacimiento.text.toString().toInt()
            val añoActual = Calendar.getInstance().get(Calendar.YEAR)

            if (añoDeNacimiento > 1900 && añoDeNacimiento < añoActual) {

                val res = añoActual - añoDeNacimiento
                txtAnioActual.text = "tu edad es $res años"
            } else {

                txtAnioActual.text = "edad no valida"
            }

        }catch (e:Exception){

                txtAnioActual.text = "año no valido"
        }
    }


}
