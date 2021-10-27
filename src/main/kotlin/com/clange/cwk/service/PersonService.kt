package com.clange.cwk.service

import com.clange.cwk.datasource.PersonDataSource
import com.clange.cwk.model.Person
import org.springframework.stereotype.Service

@Service
class PersonService (private val personSource: PersonDataSource){

    fun getPersons(): Collection<Person> = personSource.retrievePersons()

}