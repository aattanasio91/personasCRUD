package com.reba.personascrud.service.impl;

import com.reba.personascrud.dao.PersonDao;
import com.reba.personascrud.model.Person;
import com.reba.personascrud.model.request.PersonRequest;
import com.reba.personascrud.service.CountryService;
import com.reba.personascrud.service.PersonService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired private PersonDao personDao;
    @Autowired private CountryService countryService;

    public Person newPerson(PersonRequest personRequest){

        Person newPerson = new Person();

        newPerson.setName(personRequest.getName());
        newPerson.setLastName(personRequest.getLastName());
        newPerson.setBirthDate(LocalDate.parse(personRequest.getBirthDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        newPerson.setEmail(personRequest.getEmail());
        newPerson.setDocType(personRequest.getDocType());
        newPerson.setDocNumber(personRequest.getDocNumber());
        newPerson.setCountry(countryService.getByName(personRequest.getCountry().getName()));
        newPerson.setPhoneNumber(personRequest.getPhoneNumber());
        try {
            return this.persistNewPerson(newPerson);
        }catch (ServiceException se){
            se.printStackTrace();
        }
        return null;
    }

    private Person persistNewPerson(Person newPerson){
        if(haveAtLeastOneContact(newPerson) && isLegalAge(newPerson) && !personExists(newPerson.getDocType(), newPerson.getDocNumber(), newPerson.getCountry().getName())){
            Person persistedPerson = personDao.save(newPerson);
            return persistedPerson;
        }else{
            return null;
        }
    }

    public Optional<Person> getPersonById(Integer id){
        return personDao.findById(id);
    }


    public List<Person> getPersonByProperties(String docType, String docNumber, String country){
        return personDao.findPersonByDocTypeNumberAndCountry(docType, docNumber, country);
    }

    private boolean personExists(String docType, String docNumber, String country){
        return getPersonByProperties(docType, docNumber, country).size()>0;
    }


    private boolean haveAtLeastOneContact(Person person){
        return (person.getEmail() != null || person.getPhoneNumber() != null);
    }

    private boolean isLegalAge(Person person){
        Period period = Period.between(person.getBirthDate(), LocalDate.now());
        return period.getYears() >= 18;
    }

    @Override
    public String fatherOf(Integer id1, Integer id2) {
        Optional<Person> person1 = personDao.findById(id1);
        Optional<Person> person2 = personDao.findById(id2);
        if (person1.isPresent() && person2.isPresent()){
            return String.format("%s es el padre de %s", person1.get().getName(), person2.get().getName());
        }else{
            return "No es su padre";
        }

    }
}
