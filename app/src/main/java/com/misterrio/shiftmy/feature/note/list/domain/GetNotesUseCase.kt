package com.misterrio.shiftmy.feature.note.list.domain

import com.misterrio.shiftmy.feature.note.domain.entity.Note

class GetNotesUseCase (
    private val notesRepository: NotesRepository
) {


    operator fun invoke() : List<Note> = notesRepository.getNotes()
}