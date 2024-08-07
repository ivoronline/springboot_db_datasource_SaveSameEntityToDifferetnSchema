package com.ivoronline.springboot_db_datasource_savesameentitytodifferetnschema.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.context.annotation.RequestScope;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer Id;
  public String  name;
  public Integer age;

}
