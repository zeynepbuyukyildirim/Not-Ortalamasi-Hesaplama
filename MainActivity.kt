package com.example.notortalamasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit  var birincinot: EditText
    lateinit  var ikincinot:EditText
    lateinit  var sonuc: TextView
    lateinit var giris:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        birincinot = findViewById(R.id.birincinot)
        ikincinot = findViewById(R.id.ikincinot)
        sonuc = findViewById(R.id.sonuc)

    }
    fun btnHesapla(view: View?) {

        val birincinot: Double =  birincinot.text.toString().toDouble()
        val ikincinot: Double = ikincinot.text.toString().toDouble()
        val ortalama : Double = (birincinot+ikincinot)/2
        sonuc.text = java.lang.Double.toString(ortalama)
    }
}

