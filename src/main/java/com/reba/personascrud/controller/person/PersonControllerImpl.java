package com.reba.personascrud.controller.person;

import com.reba.personascrud.model.persona.Person;
import com.reba.personascrud.model.persona.request.PersonRequest;
import com.reba.personascrud.model.relation.Relation;
import com.reba.personascrud.model.relation.request.RelationRequest;
import com.reba.personascrud.service.person.PersonService;
import com.reba.personascrud.service.relation.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController("personController")
@RequestMapping(path = "/person")
public class PersonControllerImpl implements PersonController {

    @Autowired private PersonService personService;
    @Autowired private RelationService relationService;

    @Override
    @RequestMapping (value = "/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
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

    @Override
    @PostMapping(value = "/{id1}/father/{id2}")
    public boolean isTheFatherOf(@PathVariable Integer id1, @PathVariable Integer id2) {
        try {
            return relationService.isTheFatherOf(id1, id2);
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
