/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.repository;

import com.test.model.Person;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author wkassem
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
    
    Optional<List<Person>> findByFirstnameContainingIgnoreCase(String keyword);
    Optional<List<Person>> findByLastnameContainingIgnoreCase(String keyword);
    
    @Query(value="SELECT * FROM PERSON WHERE LOWER(`FIRSTNAME`) LIKE LOWER(?1) OR LOWER(`LASTNAME`) LIKE LOWER(?1)", nativeQuery = true)
    Optional<List<Person>> findAllPersonsByFirstnameAndLastname(String keyword);
    
    
}
