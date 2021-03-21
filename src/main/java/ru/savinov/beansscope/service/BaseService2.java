package ru.savinov.beansscope.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class BaseService2 implements CommandLineRunner {

    @Autowired
    AccountServicePrototype accountServicePrototype;

    @Autowired
    AccountServiceSingleton accountServiceSingleton;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------Protype--------------");
        System.out.println(accountServicePrototype.getName());

        System.out.println("----------------Singleton---------------");
        System.out.println(accountServiceSingleton.getName());
    }
    @PostConstruct
    public void init() {
        System.out.println("******************** " + getClass().getName() + " *** init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("******************** " + getClass().getName() + " *** destroy method");    }

}
