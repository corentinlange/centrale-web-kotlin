package com.clange.cwk.datasource

import com.clange.cwk.model.Person

interface PersonDataSource {
    fun retrievePersons(): Collection<Person>
}