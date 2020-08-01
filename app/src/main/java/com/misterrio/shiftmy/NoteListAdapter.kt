package com.misterrio.shiftmy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NoteListAdapter:RecyclerView.Adapter<NoteListAdapter.ViewHolder>() {
    private val noteList: MutableList<Note> = mutableListOf()
    private var noteListener: NoteListener? = null
    fun setNoteList(newNots: List<Note>){
        noteList.clear()
        noteList.addAll(newNots)

        notifyDataSetChanged()
    }

    fun setNoteListener(Listener: NoteListener){
       noteListener = Listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false)
        return ViewHolder(view, noteListener)
    }

    override fun getItemCount(): Int {
        return noteList.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(noteList[position])
    }

    class ViewHolder(itemView: View, private var noteListener: NoteListener?): RecyclerView.ViewHolder(itemView) {

      private val title: TextView = itemView.findViewById(R.id.itemTitle)

        fun bind (item: Note) {
            title.text = item.title
            itemView.setOnClickListener {
                noteListener?.onClick(item)
            }
        }
    }

    interface NoteListener {
        fun onClick(note: Note)
    }
}