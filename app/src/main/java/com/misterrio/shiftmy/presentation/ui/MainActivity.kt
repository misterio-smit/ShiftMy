package com.misterrio.shiftmy.presentation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.misterrio.shiftmy.R
import com.misterrio.shiftmy.presentation.ui.note.list.NoteListActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
           startActivity(Intent(this, NoteListActivity:: class.java))
        }
    }
}
