package com.avendanio.tm_04

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TimePickerActivity : AppCompatActivity() {
    private lateinit var timePicker: TimePicker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timepicker)

        timePicker = findViewById(R.id.timePicker)
        timePicker.setIs24HourView(true)

        findViewById<Button>(R.id.btnConfigurar).setOnClickListener {
            val hour = timePicker.hour
            val minute = timePicker.minute
            Toast.makeText(this, "Hora seleccionada: $hour:$minute", Toast.LENGTH_SHORT).show()
        }

        setupNavigation()
    }

    private fun setupNavigation() {
        findViewById<Button>(R.id.nav_autocomplete).setOnClickListener {
            startActivity(Intent(this, AutoCompleteActivity::class.java))
        }
        findViewById<Button>(R.id.nav_timepicker).setOnClickListener {
        }
        findViewById<Button>(R.id.nav_datepicker).setOnClickListener {
            startActivity(Intent(this, DatePickerActivity::class.java))
        }
    }
}