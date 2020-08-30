package com.misterrio.shiftmy.feature.hello.presintation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.misterrio.shiftmy.R
import com.misterrio.shiftmy.feature.note.list.presentation.NoteListActivity
import kotlinx.android.synthetic.main.activity_main.*

class HelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
           startActivity(Intent(this, NoteListActivity:: class.java))
        }
    }
}
