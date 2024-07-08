package com.exampleApplication.ExampleApplication.injection;

import org.springframework.stereotype.Component;

@Component
public class MyFirstClass {

    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello(){
        return "MyFirstClass  =" + myVar;
    }
}
