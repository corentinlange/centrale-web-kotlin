package com.clange.cwk.datasource.mock

import org.springframework.stereotype.Repository
import com.clange.cwk.datasource.PersonDataSource
import com.clange.cwk.model.Person


@Repository
class MockPersonDataSource: PersonDataSource {

    val persons = listOf(Person("John", "John", 1))

    override fun retrievePersons(): Collection<Person> = persons
}