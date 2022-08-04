package com.reba.personascrud.service.impl;

import com.reba.personascrud.dao.CountryDao;
import com.reba.personascrud.model.Country;
import com.reba.personascrud.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDao countryDao;

    @Override
    public Country getByName(String name) {
        return countryDao.getByName(name);
    }
}
