package com.ivoronline.springboot_db_datasource_savesameentitytodifferetnschema.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class Schema1Config {

  //=========================================================================================================
  // DATA SOURCE PROPERTIES
  //=========================================================================================================
  @Bean
  @ConfigurationProperties("schema1.spring.datasource")
  public DataSourceProperties schema1DataSourceProperties() {
    return new DataSourceProperties();
  }
  
  //=========================================================================================================
  // DATA SOURCE
  //=========================================================================================================
  @Bean
  public DataSource schema1DataSource() {
    return schema1DataSourceProperties().initializeDataSourceBuilder().build();
  }

}
