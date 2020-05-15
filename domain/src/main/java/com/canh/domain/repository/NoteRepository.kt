package com.canh.domain.repository

import com.canh.domain.model.Note

interface NoteRepository {
    fun addNote(note: Note)
    fun getNotes(): List<Note>
}
