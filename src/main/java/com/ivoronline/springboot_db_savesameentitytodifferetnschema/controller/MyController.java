package com.ivoronline.springboot_db_savesameentitytodifferetnschema.controller;

import com.ivoronline.springboot_db_savesameentitytodifferetnschema.config.SchemaContext;
import com.ivoronline.springboot_db_savesameentitytodifferetnschema.entity.Person;
import com.ivoronline.springboot_db_savesameentitytodifferetnschema.repository.PersonRepository;
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
  @GetMapping("/hello")
  public Person hello() {
    SchemaContext.setCurrentSchema(2);
    Person person = personRepository.save(new Person(0, "John", 22));
    return person;
  }

}
