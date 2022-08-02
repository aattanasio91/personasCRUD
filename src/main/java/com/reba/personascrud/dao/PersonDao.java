package com.reba.personascrud.dao;

import com.reba.personascrud.model.persona.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

    @Query("SELECT p FROM Person p WHERE p.docType = ?1 AND p.docNumber = ?2 AND p.country = ?3")
    List<Person> findPersonByDocTypeNumberAndCountry(String docType, String docNumber, String country);
}
