package com.clange.cwk.datasource.mock

import org.springframework.stereotype.Repository
import com.clange.cwk.datasource.PersonDataSource
import com.clange.cwk.model.Person


@Repository
class MockPersonDataSource: PersonDataSource {

    val persons = listOf(Person("1234","John", "Johnson", 30))

    override fun retrievePersons(): Collection<Person> = persons

    override fun retrievePerson(id: String): Person =
        persons.first { it.id == id }
}