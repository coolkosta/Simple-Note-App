package ru.coolkosta.simplenoteapp.data.local


import ru.coolkosta.simplenoteapp.domain.model.Note
import ru.coolkosta.simplenoteapp.domain.repository.NoteRepository
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(private val noteRepositoryImpl: NoteRepository) {

    suspend fun getAllNotes(): List<Note> = noteRepositoryImpl.getAllNotes()
    suspend fun insertNote(note: Note) = noteRepositoryImpl.insertNote(note = note)
    suspend fun deleteNote(note:Note) = noteRepositoryImpl.deleteNote(note = note)
    suspend fun getNoteById(id:Long) = noteRepositoryImpl.getNoteById(nodeId =  id)
}