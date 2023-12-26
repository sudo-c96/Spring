package org.example.spring.javaConfigBasedDI;

public class Car {

    private String model = "SUV";

    private Engine engine;

    public Car() {
        super();
        System.out.println("Car -- Default Constructor called");
    }

    //Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Car -- Parametrized Constructor called");
    }

    public void getDetails() {
        System.out.println("Model is " + this.model);
        this.engine.getEngineData();
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("Setter -- Engine - SI");
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
