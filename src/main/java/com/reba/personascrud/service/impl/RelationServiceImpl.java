package com.reba.personascrud.service.impl;

import com.reba.personascrud.dao.PersonDao;
import com.reba.personascrud.dao.RelationDao;
import com.reba.personascrud.model.Person;
import com.reba.personascrud.model.Relation;
import com.reba.personascrud.model.request.RelationRequest;
import com.reba.personascrud.service.RelationService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RelationServiceImpl implements RelationService {

    @Autowired
    private RelationDao relationDao;
    @Autowired
    private PersonDao personDao;

    @Override
    public String newRelation(RelationRequest relationRequest) {
        Optional<Person> person1 = personDao.findById(relationRequest.getIdPerson1());
        Optional<Person> person2 = personDao.findById(relationRequest.getIdPerson2());
        Relation relation = new Relation();
        if (person1.isPresent() && person2.isPresent()){
            relation.setIdPerson1(relationRequest.getIdPerson1());
            relation.setIdPerson2(relationRequest.getIdPerson2());
            relation.setRelation(relationRequest.getRelation());
            relationDao.save(relation);
            return relation.getRelation().getRelType();
        }else{
            throw new ServiceException("No se encuentra la persona elegida");
        }
    }

    @Override
    public String getRelation(Integer id1, Integer id2) {
        return relationDao.getRelation(id1, id2);
    }
}
