package com.adasoraninda.mysimplecleanarchitecture.data

import androidx.annotation.VisibleForTesting
import com.adasoraninda.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {

    @VisibleForTesting
    var source = MessageEntity(
        message = "Hello world Architechture"
    )

    override fun getSources(): MessageEntity {
        return source
    }
}