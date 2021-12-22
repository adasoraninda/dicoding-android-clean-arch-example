package com.adasoraninda.mysimplecleanarchitecture.di

import com.adasoraninda.mysimplecleanarchitecture.data.IMessageDataSource
import com.adasoraninda.mysimplecleanarchitecture.data.MessageDataSource
import com.adasoraninda.mysimplecleanarchitecture.data.MessageRepository
import com.adasoraninda.mysimplecleanarchitecture.domain.IMessageRepository
import com.adasoraninda.mysimplecleanarchitecture.domain.MessageInteractor
import com.adasoraninda.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {

    fun provideDataSources(): IMessageDataSource {
        return MessageDataSource()
    }

    fun provideRepository(): IMessageRepository {
        return MessageRepository(provideDataSources())
    }

    fun provideUseCase(): MessageUseCase {
        return MessageInteractor(provideRepository())
    }

}