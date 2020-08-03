package com.misterrio.shiftmy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.note_list_activity.*

class NoteListActivity: AppCompatActivity() {

    private val noteList = listOf(
        Note("Понедельник ", """
                -Ветер: ЮЗ 1 м/c
                -Давление: 749 мм рт. ст.
                -Влажность: 40%  
                -Долгота дня: 16:08
                -Восход 05:22, закат 21:30
                -Магнитных бурь нет""".trimMargin("-")),
        Note("Вторник", """
                -Ветер: ЮВ 10 м/c
                -Давление: 741 мм рт. ст.
                -Влажность: 42%  
                -Долгота дня: 16:03
                -Восход 05:25, закат 21:28
                -Магнитных бурь нет""".trimMargin("-")),
        Note("Среда", """
                -Ветер: ЮЗ 3 м/c
                -Давление: 748 мм рт. ст.
                -Влажность: 49%  
                -Долгота дня: 15:58
                -Восход 05:27, закат 21:25
                -Магнитных бурь нет""".trimMargin("-")),
        Note("Четверг", """
                -Ветер: ЮВ 8 м/c
                -Давление: 748 мм рт. ст.
                -Влажность: 51%  
                -Долгота дня: 15:55
                -Восход 05:31, закат 21:22
                -Магнитных бурь нет""".trimMargin("-")),
        Note("Пятница", """
                -Ветер: ЮВ 5 м/c
                -Давление: 744 мм рт. ст.
                -Влажность: 41%  
                -Долгота дня: 15:50
                -Восход 05:37, закат 21:18
                -Магнитных бурь нет""".trimMargin("-")),
        Note("Суббота", """
                -Ветер: ЮЗ 1 м/c
                -Давление: 749 мм рт. ст.
                -Влажность: 47%  
                -Долгота дня: 15:45
                -Восход 05:42, закат 21:15
                -Магнитных бурь нет""".trimMargin("-")),
        Note("Воскресенье", """
                -Ветер: ЮВ 6 м/c
                -Давление: 753 мм рт. ст.
                -Влажность: 40%  
                -Долгота дня: 15:43
                -Восход 05:52, закат 21:07
                -Магнитных бурь нет""".trimMargin("-") )
    )

    val adapter = NoteListAdapter{note ->
        val intent = Intent(this@NoteListActivity, NoteDetailActivity::class.java)
        intent.putExtra("Note", note )
        startActivity(intent)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.note_list_activity)

        val LayoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)

        recyiclerView.adapter = adapter
        recyiclerView.layoutManager = LayoutManager

        adapter.setNoteList(noteList)

    }
}