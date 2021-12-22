package com.adasoraninda.mysimplecleanarchitecture

import com.adasoraninda.mysimplecleanarchitecture.domain.IMessageRepository
import com.adasoraninda.mysimplecleanarchitecture.domain.MessageEntity
import com.adasoraninda.mysimplecleanarchitecture.domain.MessageInteractor
import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito

class MessageUseCaseTest {

    @Test
    fun shouldGetMessageFromGetMessage() {
        // arrange
        val message = "Hello world"
        val mockData = MessageEntity(message)

        val repository = Mockito.mock(IMessageRepository::class.java)

        val useCase = MessageInteractor(repository)
        Mockito.`when`(repository.getMessage())
            .thenReturn(mockData)

        // act
        val data = useCase.getMessage()

        // assert
        Mockito.verify(repository).getMessage()
        Mockito.verifyNoMoreInteractions(repository)

        Assert.assertEquals(message, data)
    }

}