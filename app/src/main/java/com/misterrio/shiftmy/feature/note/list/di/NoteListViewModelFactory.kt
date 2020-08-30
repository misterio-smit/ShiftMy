package com.misterrio.shiftmy.feature.note.list.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.misterrio.shiftmy.feature.note.list.data.NetworkNoteDataSourceImpl
import com.misterrio.shiftmy.feature.note.list.data.NoteRepositoryImpl
import com.misterrio.shiftmy.feature.note.list.domain.GetNotesUseCase
import com.misterrio.shiftmy.feature.note.list.presentation.NoteListViewModel

class NoteListViewModelFactory  : ViewModelProvider.Factory{
    override fun  <T : ViewModel?> create (modelClass: Class<T>): T {


        if(modelClass == NoteListViewModel :: class.java)  {
            val networkDataSource = NetworkNoteDataSourceImpl()
            val noteRepository = NoteRepositoryImpl(networkDataSource)
            val getNotesUseCase = GetNotesUseCase(noteRepository)

            return NoteListViewModel(getNotesUseCase) as T
        } else {
            error("Unexeption class $modelClass")
        }

    }
}