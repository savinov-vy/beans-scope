package ru.savinov.beansscope.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("prototype")
public class AccountServicePrototype {
    private String name = "Lory";

    public void changeName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }
    @PostConstruct
    public void init() {
        System.out.println("******************** " + getClass().getName() + " *** init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("******************** " + getClass().getName() + " *** destroy method");    }
}
