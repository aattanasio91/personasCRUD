package com.reba.personascrud.service;

import com.reba.personascrud.model.request.RelationRequest;

public interface RelationService {

    String newRelation(RelationRequest relationRequest);

    String getRelation(Integer id1, Integer id2);
}
