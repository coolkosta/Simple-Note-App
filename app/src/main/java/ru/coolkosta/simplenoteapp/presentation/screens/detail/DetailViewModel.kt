package ru.coolkosta.simplenoteapp.presentation.screens.detail


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ru.coolkosta.simplenoteapp.domain.model.Note
import ru.coolkosta.simplenoteapp.domain.usecases.DeleteNoteUseCase
import ru.coolkosta.simplenoteapp.domain.usecases.GetNoteByIdUseCase
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val getNoteByIdUseCase: GetNoteByIdUseCase,
    private val deleteNoteUseCase: DeleteNoteUseCase
) : ViewModel() {

    private val _note = MutableLiveData<Note>()
    val note:LiveData<Note>
    get() = _note


    fun getNoteById(id: Long) {
        viewModelScope.launch {
            getNoteByIdUseCase.invoke(id = id).let {
                _note.postValue(it)
            }
        }
    }

    fun deleteNote(onSuccess: () -> Unit) {
        viewModelScope.launch{
            note.value?.let {
                deleteNoteUseCase.invoke(note = it)
                onSuccess()
            }

        }
    }
}