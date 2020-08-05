package com.misterrio.shiftmy.presentation.ui.note.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.misterrio.shiftmy.R
import com.misterrio.shiftmy.model.entity.Note
import java.util.*


class NoteListAdapter(private val clickListener:(Note) -> Unit):RecyclerView.Adapter<NoteListAdapter.ViewHolder>() {

    private val noteList: MutableList<Note> = LinkedList()

    fun setNoteList(newNots: List<Note>){
        noteList.clear()
        noteList.addAll(newNots)

        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false)
        return ViewHolder(
            view,
            clickListener
        )
    }

    override fun getItemCount(): Int {
        return noteList.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(model = noteList[position])
    }

    class ViewHolder(itemView: View, private val noteListener: (Note) -> Unit): RecyclerView.ViewHolder(itemView) {

      private val title: TextView = itemView.findViewById(R.id.itemTitle)

        fun bind (model: Note) {
            title.text = model.title
            itemView.setOnClickListener {
                noteListener(model)
            }
        }
    }
}