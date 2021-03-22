package ru.savinov.beansscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.savinov.beansscope.service.BaseService2;

@SpringBootApplication
public class AppWithInvokeApplicationContext implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(AppWithInvokeApplicationContext.class, args);
    }

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        BaseService2 baseService2 = (BaseService2) applicationContext.getBean("BaseService2");
        baseService2.run();
        AutowireCapableBeanFactory beanFactory = applicationContext.getAutowireCapableBeanFactory();
        beanFactory.destroyBean(baseService2);
    }
}
