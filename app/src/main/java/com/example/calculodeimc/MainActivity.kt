package com.example.calculodeimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = Calcular
        val resultado = Resultado

        btCalcular.setOnClickListener {
            val peso = Integer.parseInt(Peso.text.toString())
            val altura = Integer.parseInt(Altura.text.toString())
            val imc = peso /((altura * altura) /10000)

            //resultado.setText()
            if(imc < 18.5f){
                resultado.setText("O seu imc é $imc \nSituação: Magreza")
            }else if(imc >= 18.5f || imc <= 24.9f){
                resultado.setText("O seu imc é $imc \nSituação: Normal")
            }else if(imc >= 25.0f || imc <= 29.9f) {
                resultado.setText("O seu imc é $imc \nSituação: Sobrepeso")
            }else if(imc >= 30.0f || imc <= 39.9f) {
                resultado.setText("O seu imc é $imc \nSituação: Obesidade")
            }else{
                resultado.setText("O seu imc é $imc \nSituação: Obesidade Grave")
            }
        }


    }
}