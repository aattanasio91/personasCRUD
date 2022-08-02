package com.reba.personascrud.service.relation;

import com.reba.personascrud.dao.relation.RelationDao;
import com.reba.personascrud.model.relation.Relation;
import com.reba.personascrud.model.relation.request.RelationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationServiceImpl implements RelationService{

    @Autowired
    private RelationDao relationDao;

    public boolean isTheFatherOf(Integer id1, Integer id2){
        return (relationDao.getRelation(id1, id2).equals("FATHER") || relationDao.getRelation(id1, id2).equals("MOTHER"));
    }

    @Override
    public String newRelation(RelationRequest relationRequest) {

        Relation relation = new Relation();
        relation.setIdPerson1(relationRequest.getIdPerson1());
        relation.setIdPerson2(relationRequest.getIdPerson2());
        relation.setRelation(relationRequest.getRelation());

        relationDao.save(relation);
        return relation.getRelation();
    }

    @Override
    public String getRelation(Integer id1, Integer id2) {
        return relationDao.getRelation(id1, id2);
    }
}
