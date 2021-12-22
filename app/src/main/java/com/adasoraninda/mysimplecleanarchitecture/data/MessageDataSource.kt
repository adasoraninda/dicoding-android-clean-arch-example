package com.adasoraninda.mysimplecleanarchitecture.data

import com.adasoraninda.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {

    override fun getSources(): MessageEntity {
        return MessageEntity(
            message = "Hello world Architechture"
        )
    }
}