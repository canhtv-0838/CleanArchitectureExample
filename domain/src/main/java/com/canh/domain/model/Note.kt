package com.canh.domain.model

data class Note(
    val id: Long = 0,
    val noteText: String = ""
) {
    fun isValidForAdd() = noteText.trim().isNotEmpty()
}
