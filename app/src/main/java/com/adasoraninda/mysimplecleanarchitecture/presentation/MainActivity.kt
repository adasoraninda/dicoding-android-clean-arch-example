package com.adasoraninda.mysimplecleanarchitecture.presentation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.adasoraninda.mysimplecleanarchitecture.R
import com.adasoraninda.mysimplecleanarchitecture.di.Injection

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textMessage = findViewById<TextView>(R.id.text_message)

        val factory = MainViewModel.factory(Injection.provideUseCase())
        val viewModel = ViewModelProvider(
            this,
            factory
        )[MainViewModel::class.java]

        viewModel.message.observe(this) {
            textMessage.text = it
        }

    }
}