package com.canh.cleanarchitectureexample.main

import androidx.lifecycle.ViewModel
import com.canh.domain.model.Note
import com.canh.domain.usecase.AddNoteUseCase

class MainViewModel(private val addNoteUseCase: AddNoteUseCase) : ViewModel() {
    fun addNote(noteText: String) {
        addNoteUseCase.invoke(Note(noteText = noteText))
    }
}
