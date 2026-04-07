package com.avendanio.tm_04

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // centra2
        findViewById<Button>(R.id.btn_to_autocomplete).setOnClickListener {
            startActivity(Intent(this, AutoCompleteActivity::class.java))
        }
        findViewById<Button>(R.id.btn_to_timepicker).setOnClickListener {
            startActivity(Intent(this, TimePickerActivity::class.java))
        }
        findViewById<Button>(R.id.btn_to_datepicker).setOnClickListener {
            startActivity(Intent(this, DatePickerActivity::class.java))
        }

        // navig
        findViewById<Button>(R.id.nav_autocomplete).setOnClickListener {
            startActivity(Intent(this, AutoCompleteActivity::class.java))
        }
        findViewById<Button>(R.id.nav_timepicker).setOnClickListener {
            startActivity(Intent(this, TimePickerActivity::class.java))
        }
        findViewById<Button>(R.id.nav_datepicker).setOnClickListener {
            startActivity(Intent(this, DatePickerActivity::class.java))
        }
    }
}