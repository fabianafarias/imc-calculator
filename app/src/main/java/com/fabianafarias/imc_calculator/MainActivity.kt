package com.fabianafarias.imc_calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import com.fabianafarias.imc_calculator.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        setTextView()
    }

    private fun setTextView() {
        altura?.doAfterTextChanged { text ->

        }

        peso?.doOnTextChanged { text, start, before, count ->

        }

        calculate_button?.setOnClickListener {
            calculateIMC(peso.text.toString(), altura.text.toString())
        }
    }

    private fun calculateIMC(peso:String, altura:String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if (peso != null && altura != null) {
            val imc = peso / (altura * altura)
            titulo_resultado.text = "Seu IMC é:\n%.2f".format(imc)
        }

    }



}