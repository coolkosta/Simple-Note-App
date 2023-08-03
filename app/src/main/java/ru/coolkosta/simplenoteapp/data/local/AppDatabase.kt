package ru.coolkosta.simplenoteapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.coolkosta.simplenoteapp.domain.model.Note
import ru.coolkosta.simplenoteapp.domain.repository.NoteRepository

@Database(entities = [Note::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun noteDao():NoteRepository
}