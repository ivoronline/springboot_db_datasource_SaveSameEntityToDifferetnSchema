package com.ivoronline.springboot_db_datasource_savesameentitytodifferetnschema.controller;

import com.ivoronline.springboot_db_datasource_savesameentitytodifferetnschema.entity.Person;
import com.ivoronline.springboot_db_datasource_savesameentitytodifferetnschema.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //=========================================================================================================
  // MIX STATEMENTS
  //=========================================================================================================
  @ResponseBody
  @GetMapping("/Hello")
  public Person hello() {
    Person person = personRepository.save(new Person(0, "John"  , 22          ));
    return person;
  }

}
