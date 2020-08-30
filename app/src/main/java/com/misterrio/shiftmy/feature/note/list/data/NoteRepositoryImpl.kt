package com.misterrio.shiftmy.feature.note.list.data

import com.misterrio.shiftmy.feature.note.domain.entity.Note
import com.misterrio.shiftmy.feature.note.list.domain.NotesRepository

class NoteRepositoryImpl(
    private val networkDataSource: NetworkDataSource
) : NotesRepository {

    override fun getNotes(): List<Note> = networkDataSource.getNotes()

}