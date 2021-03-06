package com.canh.domain.usecase

import com.canh.domain.model.Note
import com.canh.domain.repository.NoteRepository

class AddNoteUseCase(private val repository: NoteRepository) {
    operator fun invoke(note: Note) {
        if (validate(note)) {
            repository.addNote(note)
        }
    }

    private fun validate(note: Note) = note.isValidForAdd()
}
