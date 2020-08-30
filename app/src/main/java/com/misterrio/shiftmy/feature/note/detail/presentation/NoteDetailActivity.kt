package com.misterrio.shiftmy.feature.note.detail.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.misterrio.shiftmy.R
import com.misterrio.shiftmy.feature.note.domain.entity.Note
import kotlinx.android.synthetic.main.activity_detail_note.*

class NoteDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_note)

        val parametres = intent.getSerializableExtra("Note") as Note?

        deteilTitle.text = parametres?.title
        detailDescription.text = parametres?.description

    }
}