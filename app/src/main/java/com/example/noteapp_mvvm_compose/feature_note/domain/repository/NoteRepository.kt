package com.example.noteapp_mvvm_compose.feature_note.domain.repository

import com.example.noteapp_mvvm_compose.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow


/**
* we use interface so that it could be easily testable bec
* we could easily make a fake version of this repository
 */
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}