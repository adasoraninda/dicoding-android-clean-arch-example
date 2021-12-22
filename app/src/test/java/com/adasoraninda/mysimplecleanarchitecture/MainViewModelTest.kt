package com.adasoraninda.mysimplecleanarchitecture

import com.adasoraninda.mysimplecleanarchitecture.domain.MessageUseCase
import com.adasoraninda.mysimplecleanarchitecture.presentation.MainViewModel
import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito.*

class MainViewModelTest {

    @Test
    fun testGetMessage() {
        // arrange
        val message = "Hello world"

        val useCase = mock(MessageUseCase::class.java)
        `when`(useCase.getMessage())
            .thenReturn(message)

        val viewModel = MainViewModel(useCase)
        // act
        val data = viewModel.message.value

        // assert
        verify(useCase).getMessage()
        verifyNoMoreInteractions(useCase)
        Assert.assertEquals(message, data)
    }

}