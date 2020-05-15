package com.canh.data

import com.canh.data.local.db.dao.NoteDao
import com.canh.domain.model.Note
import com.canh.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val noteDao: NoteDao,
    private val mapper: NoteModelMapperImpl
) : NoteRepository {
    override fun addNote(note: Note) {
        noteDao.addNote(mapper.toEntity(note))
    }
}
