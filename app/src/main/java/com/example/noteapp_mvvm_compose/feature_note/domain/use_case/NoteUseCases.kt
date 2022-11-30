package com.example.noteapp_mvvm_compose.feature_note.domain.use_case


/**
 * This Use Case classes contains the business logics
 * These use cases has the exact name of what they do
 * This will help to make the code very reusable
 *
 * These usecase should only have 1 public function
 *
 * We could use this use case class in diffent viewmodels,
 * just in case we would want to reuse the same logic.
 *
 */

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
