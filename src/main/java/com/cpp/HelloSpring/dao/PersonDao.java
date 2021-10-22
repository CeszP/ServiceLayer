package com.cpp.HelloSpring.dao;

import com.cpp.HelloSpring.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person, Long>{
    
}
