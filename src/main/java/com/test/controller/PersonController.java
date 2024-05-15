/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.controller;

import com.test.model.Person;
import com.test.service.PersonService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author wkassem
 */
@RestController
@RequiredArgsConstructor
public class PersonController {
    
    private final PersonService personService;
    
    
    @GetMapping("/persons")
    public List<Person> getPersons() {
        return personService.getPersons();
    }
    
    @GetMapping("/persons/{keyword}")
    public List<Person> searchPersons(@PathVariable String keyword) {
        return personService.searchPersons(keyword);
    }
    
    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable Integer id) {
        return personService.getPersonById(id);
    }
    
    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
    
    @PutMapping("/person")
    public Person updatePerson(@RequestBody Person person) {
        return personService.updatePerson(person);
    }
    
    @DeleteMapping("/person")
    public void deletePerson(@RequestBody Person person) {
        personService.deletePerson(person);
    }
    
    @DeleteMapping("/person/{id}")
    public void deletePersonById(@PathVariable Integer id) {
        personService.deletePersonById(id);
    }
    
}
