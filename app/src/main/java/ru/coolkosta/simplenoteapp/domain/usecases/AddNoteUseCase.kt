package ru.coolkosta.simplenoteapp.domain.usecases

import ru.coolkosta.simplenoteapp.domain.model.Note
import ru.coolkosta.simplenoteapp.domain.repository.NoteRepository
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(private val noteRepository: NoteRepository) {

    suspend operator fun invoke(note: Note) = noteRepository.insertNote(note = note)
}