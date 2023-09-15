package com.example.refresh.controller;

import com.example.refresh.entity.Person;
import com.example.refresh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable String id) {
        return personService.getPerson(id);
    }

    @GetMapping
    public Iterable<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable String id) {
        personService.deletePerson(id);
    }
}
