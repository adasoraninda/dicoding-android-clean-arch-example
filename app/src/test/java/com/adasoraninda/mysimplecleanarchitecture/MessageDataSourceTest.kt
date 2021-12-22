package com.adasoraninda.mysimplecleanarchitecture

import com.adasoraninda.mysimplecleanarchitecture.data.MessageDataSource
import com.adasoraninda.mysimplecleanarchitecture.domain.MessageEntity
import org.junit.Assert
import org.junit.Test

class MessageDataSourceTest {

    @Test
    fun shouldGetMessageFromGetSources() {
        // arrange
        val message = "Hello world"
        val mockData = MessageEntity(message)

        val dataSource = MessageDataSource()
        dataSource.source = mockData

        // act
        val data = dataSource.getSources()

        // assert
        Assert.assertEquals(mockData, data)
        Assert.assertEquals(message, data.message)
    }

}