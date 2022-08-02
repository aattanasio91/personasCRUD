package com.reba.personascrud.service.person;

import com.reba.personascrud.model.persona.Person;
import com.reba.personascrud.model.persona.request.PersonRequest;
import java.util.Optional;

public interface PersonService {

    void newPerson(PersonRequest personRequest);

    Optional<Person> getPersonById(Integer id);

    String fatherOf(Integer id1, Integer id2);

}
