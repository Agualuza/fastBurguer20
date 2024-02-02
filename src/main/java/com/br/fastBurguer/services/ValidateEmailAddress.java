package com.br.fastBurguer.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.br.fastBurguer.adapters.gateways.email.ValidateEmailGateway;

public class ValidateEmailAddress implements ValidateEmailGateway {
    
    public boolean isEmailValid(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
