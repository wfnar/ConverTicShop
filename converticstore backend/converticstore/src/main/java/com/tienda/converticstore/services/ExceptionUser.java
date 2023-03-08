package com.tienda.converticstore.services;

public class ExceptionUser extends Exception{

    public ExceptionUser() {
        super("El Usuario no esta registrado");
    }
}
