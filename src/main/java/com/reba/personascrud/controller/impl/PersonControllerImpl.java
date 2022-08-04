package com.reba.personascrud.controller.impl;

import com.reba.personascrud.controller.PersonController;
import com.reba.personascrud.model.Person;
import com.reba.personascrud.model.request.PersonRequest;
import com.reba.personascrud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController("personController")
@RequestMapping(path = "/person")
public class PersonControllerImpl implements PersonController {

    @Autowired private PersonService personService;

    @Override
    @RequestMapping (value = "/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Person> newPerson(@RequestBody PersonRequest personRequest) {
        Person newPerson = personService.newPerson(personRequest);
        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
    }

    @Override
    @RequestMapping(value = "/getPersonById/{id}", method = RequestMethod.GET)
    public Optional<Person> getPersonById(@PathVariable Integer id) {
        try {
            return personService.getPersonById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    @PostMapping(value = "/{id1}/father/{id2}")
    public String fatherOf(@PathVariable Integer id1, @PathVariable Integer id2) {
        return personService.fatherOf(id1, id2);
    }
}
