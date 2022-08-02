package com.reba.personascrud.service.relation;

import com.reba.personascrud.model.relation.request.RelationRequest;

public interface RelationService {

    boolean isTheFatherOf(Integer id1, Integer id2);

    String newRelation(RelationRequest relationRequest);

    String getRelation(Integer id1, Integer id2);
}
