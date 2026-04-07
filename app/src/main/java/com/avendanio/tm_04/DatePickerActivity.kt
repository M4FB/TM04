package com.avendanio.tm_04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DatePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datepicker)

        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val timePicker = findViewById<TimePicker>(R.id.timePicker)

        findViewById<Button>(R.id.btnConfigurar).setOnClickListener {
            val day = datePicker.dayOfMonth
            val month = datePicker.month + 1
            val year = datePicker.year
            val hour = timePicker.hour
            val minute = timePicker.minute

            Toast.makeText(
                this,
                "Fecha: $day/$month/$year Hora: $hour:$minute",
                Toast.LENGTH_SHORT
            ).show()
        }

        setupNavigation()
    }

    private fun setupNavigation() {
        findViewById<Button>(R.id.nav_autocomplete).setOnClickListener {
            startActivity(Intent(this, AutoCompleteActivity::class.java))
        }
        findViewById<Button>(R.id.nav_timepicker).setOnClickListener {
            startActivity(Intent(this, TimePickerActivity::class.java))
        }
        findViewById<Button>(R.id.nav_datepicker).setOnClickListener {
        }
    }
}