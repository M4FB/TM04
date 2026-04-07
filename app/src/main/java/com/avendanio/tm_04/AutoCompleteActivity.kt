package com.avendanio.tm_04

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AutoCompleteActivity : AppCompatActivity() {
    val presidents = arrayOf(
        "José Luis Bustamante", "Zenón Noriega", "Manuel Odriá", "Manuel Prado",
        "Fco Morales Bermúdez", "Fernando Belaunde", "Alberto Fujimori",
        "Valentín Paniagua", "Alejandro Toledo", "Alan García",
        "Pedro Pablo Kuczynski", "Martín Alberto Vizcarra",
        "Pedro Castillo Terrones", "Dina Boluarte Zegarra", "Jose Jeri Ore"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autocomplete)

        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, presidents)
        val textView = findViewById<AutoCompleteTextView>(R.id.txtPresidentes)
        textView.threshold = 3
        textView.setAdapter(adapter)

        setupNavigation()
    }

    private fun setupNavigation() {
        findViewById<Button>(R.id.nav_autocomplete).setOnClickListener {
        }
        findViewById<Button>(R.id.nav_timepicker).setOnClickListener {
            startActivity(Intent(this, TimePickerActivity::class.java))
        }
        findViewById<Button>(R.id.nav_datepicker).setOnClickListener {
            startActivity(Intent(this, DatePickerActivity::class.java))
        }
    }
}