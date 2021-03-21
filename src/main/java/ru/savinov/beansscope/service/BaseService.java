package ru.savinov.beansscope.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class BaseService implements CommandLineRunner {

    @Autowired
    AccountServicePrototype accountServicePrototype;

    @Autowired
    AccountServiceSingleton accountServiceSingleton;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Work BaseService. now rewrite objects ");
        System.out.println("------------Protype--------------");
        accountServicePrototype.changeName("Bax");
        System.out.println(accountServicePrototype.getName());

        System.out.println("----------------Singleton---------------");
        accountServiceSingleton.changeName("Bax");
        System.out.println(accountServiceSingleton.getName());

    }
}
