package com.burhan.servlets.model.util;

public class Validate {
    public static boolean isNull(String user_field){
        return user_field==null;
    }

    public static boolean isValid(String user_field,String user_dao_field){
        return user_field.equals(user_dao_field);
    }
}