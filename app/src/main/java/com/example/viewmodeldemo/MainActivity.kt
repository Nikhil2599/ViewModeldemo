package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.VIEW_MODEL_STORE_OWNER_KEY
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() ,LifecycleOwner{
    lateinit var textView: TextView
    lateinit var button:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.textView)
        button=findViewById(R.id.button)
        val viewModel= ViewModelProvider(this).get(ViewModel::class.java)

        button.setOnClickListener {
            viewModel.addnumber()
            textView.text=viewModel.number.toString()
        }
    }
}