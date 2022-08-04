package com.reba.personascrud.controller;

import com.reba.personascrud.model.request.RelationRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface RelationController {

    String newRelation(@RequestBody RelationRequest relationRequest);

    String getRelation(@PathVariable Integer id1, @PathVariable Integer id2);
}
