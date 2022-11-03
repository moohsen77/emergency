package com.example.emergencyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emergencies = arrayListOf<Emergency>()
        emergencies.add(Emergency(R.drawable.child, getString(R.string.child), "16000"))
        emergencies.add(Emergency(R.drawable.fire, getString(R.string.fire), "180"))
        emergencies.add(Emergency(R.drawable.police, getString(R.string.police), "122"))

        val adapter = EmergencyAdapter(this, emergencies)
        val rv: RecyclerView = findViewById(R.id.rv)
        rv.adapter = adapter
    }

    override fun onBackPressed() {
        val exit = ExitDialog()
        exit.isCancelable = false
        exit.show(supportFragmentManager,null)
    }
}