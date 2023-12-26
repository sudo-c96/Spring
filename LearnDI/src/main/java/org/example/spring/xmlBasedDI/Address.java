package org.example.spring.xmlBasedDI;

public class Address {
    private String city;
    private String state;
    private String country;

    public Address() {
        super();
        System.out.println("Address -- Default Constructor called");
    }

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
        System.out.println("Address -- Parametrized Constructor called");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("Setter -- Address City");
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("Setter -- Address State");
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        System.out.println("Setter -- Address Country");
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
