package com.springs.SpringScenario.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Password {

    public static void main(String[] args) {
        PasswordEncoder p=new BCryptPasswordEncoder();
        System.out.println(p.encode("test"));
    }
}
