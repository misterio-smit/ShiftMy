package com.misterrio.shiftmy

import java.io.Serializable

data class Note (val title: String,
            val description: String? = null) :Serializable