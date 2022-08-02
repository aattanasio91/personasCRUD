package com.reba.personascrud.controller.relation;

import com.reba.personascrud.model.relation.Relation;
import com.reba.personascrud.model.relation.request.RelationRequest;
import com.reba.personascrud.service.relation.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("relationController")
@RequestMapping(path = "/relation")
public class RelationControllerImpl implements RelationController{

    @Autowired
    private RelationService relationService;

    @Override
    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Boolean> newRelation(@RequestBody RelationRequest relationRequest){
        relationService.newRelation(relationRequest);
        return new ResponseEntity<>(Boolean.TRUE, HttpStatus.CREATED);
    }

    @Override
    @GetMapping(value = "/{id1}/{id2}")
    public String getRelation(@PathVariable Integer id1, @PathVariable Integer id2) {
        return relationService.getRelation(id1, id2);
    }
}
