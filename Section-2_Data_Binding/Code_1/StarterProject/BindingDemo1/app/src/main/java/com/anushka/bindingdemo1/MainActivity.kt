package com.anushka.bindingdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.anushka.bindingdemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var databinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        databinding.submitButton.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        val messageView = findViewById<TextView>(R.id.greeting_text_view)
        val nameText = findViewById<EditText>(R.id.name_edit_text)

        databinding.greetingTextView.text = "Hello! "+ databinding.nameEditText.text
    }
}