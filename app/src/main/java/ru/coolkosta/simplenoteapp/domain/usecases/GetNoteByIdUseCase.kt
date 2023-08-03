package ru.coolkosta.simplenoteapp.domain.usecases

import ru.coolkosta.simplenoteapp.domain.repository.NoteRepository
import javax.inject.Inject

class GetNoteByIdUseCase @Inject constructor(private val noteRepository: NoteRepository) {

    suspend operator fun invoke(id: Long) = noteRepository.getNoteById(nodeId = id)
}