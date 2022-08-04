package com.reba.personascrud.dao;

import com.reba.personascrud.model.Relation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RelationDao extends CrudRepository<Relation, Integer> {

    @Query("SELECT r.relation.relType FROM Relation r WHERE r.idPerson1 = ?1 AND r.idPerson2 = ?2")
    String getRelation(Integer id1, Integer id2);
}
