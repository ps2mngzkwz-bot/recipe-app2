package com.student.recipes

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonText = assets.open("recipes.json").bufferedReader().use { it.readText() }
        findViewById<TextView>(R.id.textView).text = jsonText
    }
}
