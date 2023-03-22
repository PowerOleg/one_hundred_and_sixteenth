package com.spring;

import org.springframework.stereotype.Component;

@Component
public class StudentJava {
    public void getMessage() {
        //задача сюда добавить логику
        System.out.println("Hello, I study Java");
    }

    public String getName() {
        return "Maxim";
    }
}
