package com.ivoronline.springboot_db_datasource_savesameentitytodifferetnschema.repository;

import com.ivoronline.springboot_db_datasource_savesameentitytodifferetnschema.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> { }
