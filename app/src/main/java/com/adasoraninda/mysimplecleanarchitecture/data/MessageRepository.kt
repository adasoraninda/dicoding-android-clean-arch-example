package com.adasoraninda.mysimplecleanarchitecture.data

import com.adasoraninda.mysimplecleanarchitecture.domain.IMessageRepository
import com.adasoraninda.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(
    private val source: IMessageDataSource
) : IMessageRepository {

    override fun getMessage(): MessageEntity {
        return source.getSources()
    }
}