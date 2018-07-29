package com.example.vicky.dynamicappshortcutexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display.*

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        display.text = "No Data"
        if(intent.hasExtra("data")){
            display.text = intent.getStringExtra("data")
        }

    }
}
