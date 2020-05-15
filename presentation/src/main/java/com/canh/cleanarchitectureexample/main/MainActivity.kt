package com.canh.cleanarchitectureexample.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.canh.cleanarchitectureexample.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAddNote.setOnClickListener {
            viewModel.addNote(edtNote.text.toString())
        }
    }
}
