package com.ivoronline.springboot_db_savesameentitytodifferetnschema.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultiRoutingDataSource extends AbstractRoutingDataSource {

  //=========================================================================================================
  // DETERMINE CURRENT LOOKUP KEY
  //=========================================================================================================
  @Override
  protected Object determineCurrentLookupKey() {
    return SchemaContext.getCurrentSchema();
  }
    
}
