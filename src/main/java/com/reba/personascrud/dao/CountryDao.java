package com.reba.personascrud.dao;

import com.reba.personascrud.model.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDao extends CrudRepository<Country, Integer> {

    @Query("SELECT c FROM Country c WHERE c.name = ?1")
    public Country getByName(String name);
}
