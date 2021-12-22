package com.adasoraninda.mysimplecleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.adasoraninda.mysimplecleanarchitecture.domain.MessageUseCase

class MainViewModel(useCase: MessageUseCase) : ViewModel() {

    private val _message = MutableLiveData(useCase.getMessage())

    val message: LiveData<String>
        get() = _message

    companion object {

        @Suppress("UNCHECKED_CAST")
        fun factory(useCase: MessageUseCase) = object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return MainViewModel(useCase) as T
            }
        }

    }

}