package com.exampleApplication.ExampleApplication.injection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

   /* @Autowired
    @Qualifier("mySecondClass")*/


    private  MyFirstClass myFirstClass ;



    private Environment environment;

    @Autowired

    public void setMyFirstClass(

            @Qualifier("mySecondClass") MyFirstClass myFirstClass
    ) {
        this.myFirstClass = myFirstClass;

    }
    /* method injection
    public void injectDependencies(

            @Qualifier("mySecondClass") MyFirstClass myFirstClass
    ) {
        this.myFirstClass = myFirstClass;

    }*/


   /*  constructor injection
   public MyFirstService(
       MyFirstClass myFirstClass
    ) {
        this.myFirstClass = myFirstClass;
    }*/

    public String tellAStroty(){

        return  myFirstClass.sayHello() + " is injected into MyFirstService (Construtor injection)";
    }
    public String getJavaVersion(){

        return   environment.getProperty("java.version");
    }
    public String getOsName(){

        return   environment.getProperty("os.name");
    }

    public String readProp(){

        return   environment.getProperty("my.custom.property");
    }

   @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
