package org.example.spring;

import org.example.spring.xmlBasedDI.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@ComponentScan("org.example.spring")
public class App 
{
    public static void main( String[] args ) {

        System.out.println( "Hello World!" );
        //XML Based DI
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Employee emp1 = (Employee) context.getBean("employee");
        System.out.println(emp1);
    }
}
