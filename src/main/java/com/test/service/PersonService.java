/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.service;

import com.test.model.Person;
import com.test.repository.PersonRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author wkassem
 */
@Service
@RequiredArgsConstructor
public class PersonService {
    
    private final PersonRepository repository;
    
    public List<Person> getPersons() {
        return repository.findAll();
    }
    
    public Person getPersonById(Integer id) {
        return repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Person with id %d not found", id)));
    }
    
    public List<Person> searchPersons(String keyword) {
        return repository.findAllPersonsByFirstnameAndLastname('%'+keyword+'%').get();
    }
    
    public Person createPerson(Person person) {
        return repository.save(person);
    }
    
    public Person updatePerson(Person person) {
        return repository.save(person);
    }
    
    public void deletePerson(Person person) {
        repository.delete(person);
    }
    
    public void deletePersonById(Integer id) {
        repository.delete(getPersonById(id));
        
    }
}
