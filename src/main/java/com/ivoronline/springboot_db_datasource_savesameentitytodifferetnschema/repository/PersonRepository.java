package com.ivoronline.springboot_db_datasource_savesameentitytodifferetnschema.repository;

import com.ivoronline.springboot_db_datasource_savesameentitytodifferetnschema.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
public interface PersonRepository extends JpaRepository<Person, Integer> { }
