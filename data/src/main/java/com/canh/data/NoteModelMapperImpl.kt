package com.canh.data

import com.canh.data.model.NoteEntity
import com.canh.domain.model.Note
import com.canh.domain.repository.NoteModelMapper

class NoteModelMapperImpl : NoteModelMapper<NoteEntity, Note> {
    override fun fromEntity(from: NoteEntity): Note {
        return Note(from.id, from.noteText)
    }

    override fun toEntity(from: Note): NoteEntity {
        return NoteEntity(from.id, from.noteText, System.currentTimeMillis())
    }
}
