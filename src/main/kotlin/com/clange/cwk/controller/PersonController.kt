package com.clange.cwk.controller

import com.clange.cwk.model.Person
import com.clange.cwk.service.PersonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/persons")
class PersonController (private val service: PersonService) {

    @GetMapping
    fun getPersons(): Collection<Person> = service.getPersons()
}