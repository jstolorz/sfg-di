package com.bluesoft.sfgdi;

import com.bluesoft.sfgdi.config.SfgConfiguration;
import com.bluesoft.sfgdi.controllers.*;
import com.bluesoft.sfgdi.datasource.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        final ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());


        System.out.println("---------------- My ");

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.seyHello());

        System.out.println("---------------- Property ");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("---------------- Setter ");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("---------------- Constructor ");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean("fakeDataSource");
        System.out.println(fakeDataSource);

        SfgConfiguration sfgConfiguration = (SfgConfiguration) ctx.getBean("sfgConfiguration");
        System.out.println(sfgConfiguration);
    }

}
