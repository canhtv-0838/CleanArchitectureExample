package com.canh.domain.usecase

import com.canh.domain.repository.NoteRepository

class GetNotesUseCase(private val repository: NoteRepository) {
    fun getNotes() = repository.getNotes()
}
