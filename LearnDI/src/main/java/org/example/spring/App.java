package org.example.spring;

import org.example.spring.annotationBasedDI.Student;
import org.example.spring.javaConfigBasedDI.Car;
import org.example.spring.javaConfigBasedDI.JavaConfig;
import org.example.spring.xmlBasedDI.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
        //XML Based DI
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //XML Based DI - Constructor Injection
        System.out.println("Object creation using CI - XML Based");
        Employee emp1 = (Employee) context.getBean("emp1");
        String city1 = emp1.getAddress().getCity();
        System.out.println("City: "+city1);
        System.out.println(emp1);

        System.out.println();
        System.out.println("********************************");
        System.out.println();

        //XML Based DI - Setter Injection
        System.out.println("Object creation using SI - XML Based");
        Employee emp2 = (Employee) context.getBean("emp2");
        String city2 = emp2.getAddress().getCity();
        System.out.println("City: "+city2);
        System.out.println(emp2);

        System.out.println();
        System.out.println("||||||||||||||||||||||||||||||||||||||");
        System.out.println();


        //Annotation Based DI

        //appConfig.xml has the base package for component-scan. Below way can be used and
        // context.scan() can be omitted from below
        //ApplicationContext unusedContext = new ClassPathXmlApplicationContext("appConfig.xml");

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        System.out.println("Object creation using Annotation Based");
        appContext.scan("org.example.spring.annotationBasedDI");
        appContext.refresh();
        Student student = appContext.getBean(Student.class);
        appContext.close();
        System.out.println(student);
        System.out.println(student.getDegreeDetails());

        System.out.println();
        System.out.println("||||||||||||||||||||||||||||||||||||||");
        System.out.println();


        //Java Configuration Based DI

        //Java Configuration Based DI - Constructor Injection
        ApplicationContext javaContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println("Object creation using CI - Java Configuration Based");
        Car car = javaContext.getBean("car1", Car.class);
        System.out.println(car);
        car.getDetails();

        System.out.println();
        System.out.println("********************************");
        System.out.println();

        //Java Configuration Based DI - Setter Injection
        System.out.println("Object creation using SI - Java Configuration Based");
        Car car1 = javaContext.getBean("car3", Car.class);
        System.out.println(car);
        car.getDetails();

    }
}
