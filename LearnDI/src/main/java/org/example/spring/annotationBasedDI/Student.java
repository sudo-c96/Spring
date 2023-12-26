package org.example.spring.annotationBasedDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    private int studentId = 127;
    private String studentName = "Anuj";

    //@Autowired doesn't work for primitives or Strings

    //We use interface references here to promote loose coupling
    //If interface has multiple implementations,
    //use @Qualifier("graduationDegree") Degree degree in all injection types

    //Field Injection
    //@Autowired
    private Degree degree;

    public Student() {
        super();
        System.out.println("Student -- Default Constructor called");
    }

    //Constructor Injection
    //@Autowired is not required in CI if only 1 constructor in Class
    @Autowired
    public Student(Degree degree) {
        this.degree = degree;
        System.out.println("Student -- Parametrized Constructor called - CI");
    }

    public String getDegreeDetails() {
        return this.degree.getDegree();
    }

    //Setter Injection
    //@Autowired
    public void setDegree(Degree degree) {
        System.out.println("Setter -- Degree - SI");
        this.degree = degree;
    }

    //Method Injection
    //@Autowired
    public void changeDegree(Degree degree) {
        System.out.println("Normal Method -- Change Degree - MI");
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", degree=" + degree +
                '}';
    }
}
