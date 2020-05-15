package com.canh.cleanarchitectureexample.addnote

import androidx.lifecycle.ViewModel
import com.canh.domain.model.Note
import com.canh.domain.usecase.AddNoteUseCase
import com.canh.domain.usecase.GetNotesUseCase

class AddNoteViewModel(private val addNoteUseCase: AddNoteUseCase,
                       private val getNotesUseCase: GetNotesUseCase) : ViewModel() {
    fun addNote(noteText: String) {
        addNoteUseCase.addNote(Note(noteText = noteText))
    }

    fun getNotes() = getNotesUseCase.getNotes()
}
