package org.example.spring.javaConfigBasedDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//applicationContext.xml is replaced by the Configuration class which will be used
//as metadata for Bean creation of the methods present in this class with @Bean annotation.

//This DI is implemented using @Configuration and @Bean annotation.
@Configuration
public class JavaConfig {

    @Bean
    public Engine getEngine() {
        //creating a new Engine Object for DI in Car
        return new Engine();
    }

    //Constructor Injection
    @Bean(name = {"car1","car2"})
    public Car getCarByCI() {
        //creating a new Car Object and returning
        //Bean of engine is equal to the method name, passed as Constructor
        return new Car(getEngine());
    }

    //Setter Injection
    @Bean(name = {"car3"})
    public Car getCarBySI() {
        //creating a new Car Object and returning
        //Bean of engine is equal to the method name, passed in Setter Method
        Car car = new Car();
        car.setEngine(getEngine());
        return car;
    }
}
