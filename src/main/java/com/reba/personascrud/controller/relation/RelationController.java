package com.reba.personascrud.controller.relation;

import com.reba.personascrud.model.relation.Relation;
import com.reba.personascrud.model.relation.request.RelationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface RelationController {

    ResponseEntity<Boolean> newRelation(@RequestBody RelationRequest relationRequest);

    String getRelation(@PathVariable Integer id1, @PathVariable Integer id2);
}
