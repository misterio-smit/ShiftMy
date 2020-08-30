package com.misterrio.shiftmy.feature.note.domain.entity

import java.io.Serializable

data class Note (val title: String,
                 val description: String? = null
) :Serializable