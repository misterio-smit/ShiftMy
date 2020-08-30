package com.misterrio.shiftmy.feature.note.list.domain

import com.misterrio.shiftmy.feature.note.domain.entity.Note

interface NotesRepository {

    fun getNotes() : List<Note>
}