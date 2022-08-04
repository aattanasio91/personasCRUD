package com.reba.personascrud.controller.impl;

import com.reba.personascrud.controller.RelationController;
import com.reba.personascrud.model.request.RelationRequest;
import com.reba.personascrud.service.RelationService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("relationController")
@RequestMapping(path = "/relation")
public class RelationControllerImpl implements RelationController {

    @Autowired
    private RelationService relationService;

    @Override
    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public String newRelation(@RequestBody RelationRequest relationRequest){
        try{
            String relation = relationService.newRelation(relationRequest);
            return String.format("Se creó la relacion %s", relation);
        }catch(ServiceException se){
            se.getMessage();
        }
        return "No se pudo crear la relación";
    }

    @Override
    @GetMapping(value = "/{id1}/{id2}")
    public String getRelation(@PathVariable Integer id1, @PathVariable Integer id2) {
        String relation = relationService.getRelation(id1, id2);
        if(relation != null){
            return relation;
        }else{
            return "No se encontró relación";
        }
    }
}
