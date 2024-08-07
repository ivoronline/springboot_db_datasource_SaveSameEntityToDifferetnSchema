package com.ivoronline.springboot_db_datasource_savesameentitytodifferetnschema.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.context.annotation.RequestScope;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
  basePackages            = "com.ivoronline.springboot_db_datasource_savesameentitytodifferetnschema.repository",
  entityManagerFactoryRef = "myEntityManagerFactoryBean",
  transactionManagerRef   = "myTransactionManager"
)
public class MyDatabaseConfig {

  //=========================================================================================================
  // ENTITY MANAGER FACTORY BEAN
  //=========================================================================================================
  @Bean
  LocalContainerEntityManagerFactoryBean myEntityManagerFactoryBean(@Qualifier("schema1DataSource") DataSource dataSource) {
    
    LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
    emf.setDataSource      (dataSource);
    emf.setPackagesToScan  ("com.ivoronline.springboot_db_datasource_savesameentitytodifferetnschema.entity");
    emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
    
    return emf;
    
  }

  //=========================================================================================================
  // SCHEMA 1 TRANSACTION MANAGER
  //=========================================================================================================
  @Bean
  PlatformTransactionManager myTransactionManager(LocalContainerEntityManagerFactoryBean emfb) {
    return new JpaTransactionManager(emfb.getObject());
  }


}
