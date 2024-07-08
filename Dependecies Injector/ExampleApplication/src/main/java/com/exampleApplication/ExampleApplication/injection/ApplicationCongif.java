package com.exampleApplication.ExampleApplication.injection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationCongif {
    @Bean
    @Qualifier("bean1")
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("Defined in bean one ");

    }

    @Bean
    public MyFirstClass mySecondClass() {
        return new MyFirstClass("Defined in bean two ");

    }
    @Bean
   // @Primary
    public MyFirstClass myThirdClass() {
        return new MyFirstClass("Defined in bean three ");

    }
}
