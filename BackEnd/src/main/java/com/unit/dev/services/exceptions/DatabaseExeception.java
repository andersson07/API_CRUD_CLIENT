package com.unit.dev.services.exceptions;

public class DatabaseExeception extends  RuntimeException {
    private static final Long serialVersionUID = 1L;

    public DatabaseExeception(String msg){
        super(msg);
    }
}

