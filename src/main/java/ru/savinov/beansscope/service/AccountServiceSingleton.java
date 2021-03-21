package ru.savinov.beansscope.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class AccountServiceSingleton {
    private String name = "Lory";

    public void changeName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }
}
