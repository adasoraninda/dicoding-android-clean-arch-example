package com.adasoraninda.mysimplecleanarchitecture.data

import com.adasoraninda.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getSources(): MessageEntity
}