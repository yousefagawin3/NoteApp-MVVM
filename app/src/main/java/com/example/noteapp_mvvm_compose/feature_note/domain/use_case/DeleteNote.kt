package com.example.noteapp_mvvm_compose.feature_note.domain.use_case

import com.example.noteapp_mvvm_compose.feature_note.domain.model.Note
import com.example.noteapp_mvvm_compose.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    /**
     * we want to override the invoke func so we can use the class as a func
     */
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}