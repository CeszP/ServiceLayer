package com.cpp.HelloSpring.service;

import com.cpp.HelloSpring.dao.PersonDao;
import com.cpp.HelloSpring.domain.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class personServiceImpl implements PersonService{
    
    @Autowired
    private PersonDao personDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Person> listPeople() {
        return (List<Person>) personDao.findAll();
    }

    @Override
    @Transactional
    public void save(Person person) {
        personDao.save(person);
    }

    @Override
    @Transactional
    public void delete(Person person) {
        personDao.delete(person);
    }

    @Override
    @Transactional(readOnly = true)
    public Person findPerson(Person person) {
        return personDao.findById(person.getId_person()).orElse(null);
    }
    
}
