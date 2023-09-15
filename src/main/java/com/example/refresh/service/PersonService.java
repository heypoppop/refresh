package com.example.refresh.service;

import com.example.refresh.entity.Person;
import com.example.refresh.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public Person getPerson(String id) {
        return personRepository.findById(id).orElse(null);
    }

    public Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public void deletePerson(String id) {
        personRepository.deleteById(id);
    }
}
