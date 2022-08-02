package com.reba.personascrud.controller.person;

import com.reba.personascrud.model.persona.Person;
import com.reba.personascrud.model.persona.request.PersonRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

public interface PersonController {


    ResponseEntity<Boolean> newPerson(@RequestBody PersonRequest personRequest);

    Optional<Person> getPersonById(@PathVariable Integer id);

    String fatherOf(@PathVariable Integer id1, @PathVariable Integer id2);
}
