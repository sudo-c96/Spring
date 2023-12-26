package org.example.spring.javaConfigBasedDI;

public class Engine {

    String type = "Petrol engine";


    public Engine() {
        super();
        System.out.println("Engine -- Default Constructor called");
    }

    public void getEngineData() {
        System.out.println("This car has a " + this.type);
    }
}
