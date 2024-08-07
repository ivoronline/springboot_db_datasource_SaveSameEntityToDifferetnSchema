package com.ivoronline.springboot_db_savesameentitytodifferetnschema.config;

public class DBContextHolder {

    private static final ThreadLocal<Integer> contextHolder = new ThreadLocal<>();
    
    public static void setCurrentDb(Integer dbType) {
        contextHolder.set(dbType);
    }
    
    public static Integer getCurrentDb() {
        return contextHolder.get();
    }
    
    public static void clear() {
        contextHolder.remove();
    }
    
}