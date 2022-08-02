package com.reba.personascrud.controller;

import com.reba.personascrud.model.persona.Person;
import com.reba.personascrud.model.persona.request.PersonRequest;
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
    @RequestMapping (value = "/newPerson", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Boolean> newPerson(@RequestBody PersonRequest personRequest) {
        personService.newPerson(personRequest);
        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.CREATED);
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
}
