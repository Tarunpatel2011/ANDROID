package com.example.myapplicationt

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
         val listview = findViewById<ListView>(R.id.list_item)
        val items = listOf("BCA" , "MCA" , "MSC-IT" , "MBA")

        val adapter = ArrayAdapter(
            this,
             android.R.layout.simple_list_item_1,
             items
        )
        listview.adapter = adapter
        }
    }
