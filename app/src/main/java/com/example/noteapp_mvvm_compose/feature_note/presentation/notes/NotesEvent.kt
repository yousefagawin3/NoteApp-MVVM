package com.example.noteapp_mvvm_compose.feature_note.presentation.notes

import com.example.noteapp_mvvm_compose.feature_note.domain.model.Note
import com.example.noteapp_mvvm_compose.feature_note.domain.util.NoteOrder

/**
 * These are every UI events from the user
 */
sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
