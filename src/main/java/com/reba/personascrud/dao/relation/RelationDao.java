package com.reba.personascrud.dao.relation;

import com.reba.personascrud.model.relation.Relation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RelationDao extends JpaRepository<Relation, Integer> {

    @Query("SELECT r.relation FROM Relation r WHERE r.idPerson1 = ?1 AND r.idPerson2 = ?2")
    String getRelation(Integer id1, Integer id2);
}
