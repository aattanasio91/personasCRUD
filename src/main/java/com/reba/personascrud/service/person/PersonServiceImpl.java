package com.reba.personascrud.service.person;

import com.reba.personascrud.dao.person.PersonDao;
import com.reba.personascrud.dao.relation.RelationDao;
import com.reba.personascrud.model.persona.Person;
import com.reba.personascrud.model.persona.request.PersonRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired private PersonDao personDao;

    public void newPerson(PersonRequest personRequest){

        Person newPerson = new Person();

        newPerson.setName(personRequest.getName());
        newPerson.setLastName(personRequest.getLastName());
        newPerson.setBirthDate(LocalDate.parse(personRequest.getBirthDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        newPerson.setEmail(personRequest.getEmail());
        newPerson.setDocType(personRequest.getDocType());
        newPerson.setDocNumber(personRequest.getDocNumber());
        newPerson.setCountry(personRequest.getCountry());
        newPerson.setPhoneNumber(personRequest.getPhoneNumber());

        this.persistNewPerson(newPerson);

    }

    private void persistNewPerson(Person newPerson){
        if(haveAtLeastOneContact(newPerson) && isLegalAge(newPerson) && !personExists(newPerson.getDocType(), newPerson.getDocNumber(), newPerson.getCountry())){
            personDao.save(newPerson);
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

}
