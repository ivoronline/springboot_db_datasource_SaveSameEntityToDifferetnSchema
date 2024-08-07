package com.ivoronline.springboot_db_savesameentitytodifferetnschema.config;

public class SchemaContext {

    private static final ThreadLocal<Integer> schema = new ThreadLocal<>();
    
    public static void setCurrentSchema(Integer newSchema) {
        schema.set(newSchema);
    }
    
    public static Integer getCurrentSchema() {
        return schema.get();
    }
    
    public static void clear() {
        schema.remove();
    }
    
}