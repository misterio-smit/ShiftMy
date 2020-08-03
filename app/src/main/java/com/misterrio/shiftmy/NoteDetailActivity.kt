package com.misterrio.shiftmy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_note.*
import org.w3c.dom.Node

class NoteDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_note)

        val parametres = intent.getSerializableExtra("Note") as Note?

        deteilTitle.text = parametres?.title
        detailDescription.text = parametres?.description

    }
}