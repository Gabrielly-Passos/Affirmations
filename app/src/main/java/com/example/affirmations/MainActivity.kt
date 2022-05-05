package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val textView: TextView = findViewById(R.id.recycler_view)
        textView.text= Datasource().loadAffirmations().size.toString()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}