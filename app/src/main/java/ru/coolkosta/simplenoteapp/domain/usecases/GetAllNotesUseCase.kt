package ru.coolkosta.simplenoteapp.domain.usecases


import ru.coolkosta.simplenoteapp.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(private val noteRepository: NoteRepository) {

    suspend operator fun invoke() = noteRepository.getAllNotes()
}