package com.misterrio.shiftmy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_note.*
import org.w3c.dom.Node

class DetailNoteActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_note)

        val parametres = intent.getStringArrayListExtra("Note")
        deteilTitle.text = parametres?.get(0)
        detailDescription.text = parametres?.get(1)

    }
}