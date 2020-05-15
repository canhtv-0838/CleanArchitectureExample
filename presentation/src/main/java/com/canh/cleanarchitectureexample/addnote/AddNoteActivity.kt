package com.canh.cleanarchitectureexample.addnote

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.canh.cleanarchitectureexample.R
import kotlinx.android.synthetic.main.activity_add_note.*
import org.koin.android.viewmodel.ext.android.viewModel

class AddNoteActivity : AppCompatActivity() {
    private val viewModel: AddNoteViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        btnAddNote.setOnClickListener {
            viewModel.addNote(edtNote.text.toString())
        }

        btnGetNotes.setOnClickListener {
            txtNotes.text = viewModel.getNotes().toString()
        }
    }
}
