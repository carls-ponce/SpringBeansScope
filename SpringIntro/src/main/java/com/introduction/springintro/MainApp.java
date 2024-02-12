package com.introduction.springintro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("mundo");
        objA.setMessage("Objeto A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context.getBean("mundo");
        objB.getMessage();


    }
}