package com.reba.personascrud.service;

import com.reba.personascrud.model.Person;
import com.reba.personascrud.model.request.PersonRequest;


import java.util.Optional;

public interface PersonService {

    Person newPerson(PersonRequest personRequest);

    Optional<Person> getPersonById(Integer id);

    String fatherOf(Integer id1, Integer id2);
}
