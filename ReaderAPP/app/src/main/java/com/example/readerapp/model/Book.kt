package com.example.readerapp.model

import android.content.ClipData.Item

data class Book(
    val items: List<Item>,
    val kind: String,
    val totalItems: Int
)