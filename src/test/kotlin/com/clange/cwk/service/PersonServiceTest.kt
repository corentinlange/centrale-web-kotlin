package com.clange.cwk.service

import com.clange.cwk.datasource.PersonDataSource
import io.mockk.*
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PersonServiceTest{

    private val personSource: PersonDataSource = mockk(relaxed = true)

    private val personService = PersonService(personSource)

    @Test
    fun `should call its data source to retrieve persons`() {
        // when
        personService.getPersons()

        // then
        verify(exactly = 1) { personSource.retrievePersons() }
    }
}