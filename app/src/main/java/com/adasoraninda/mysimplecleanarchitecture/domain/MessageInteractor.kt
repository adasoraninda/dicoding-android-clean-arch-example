package com.adasoraninda.mysimplecleanarchitecture.domain

class MessageInteractor(
    private val repository: IMessageRepository
) : MessageUseCase {

    override fun getMessage(): String {
        val data = repository.getMessage()
        return data.message
    }
}