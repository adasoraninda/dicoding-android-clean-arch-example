package com.adasoraninda.mysimplecleanarchitecture

import com.adasoraninda.mysimplecleanarchitecture.data.IMessageDataSource
import com.adasoraninda.mysimplecleanarchitecture.data.MessageRepository
import com.adasoraninda.mysimplecleanarchitecture.domain.MessageEntity
import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito.*

class MessageRepositoryTest {

    @Test
    fun shouldGetMessageFromGetMessage() {
        // arrange
        val message = "Hello world"
        val mockData = MessageEntity(message)

        val dataSource = mock(IMessageDataSource::class.java)

        val repository = MessageRepository(dataSource)
        `when`(dataSource.getSources())
            .thenReturn(mockData)

        // act
        val data = repository.getMessage()

        // assert
        verify(dataSource).getSources()
        verifyNoMoreInteractions(dataSource)

        Assert.assertEquals(mockData, data)
        Assert.assertEquals(message, data.message)
    }

}