package com.learning.spring.common;

import com.learning.spring.beans.Sample;
import com.learning.spring.beans.School;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSchool
    {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("school_module.xml");

            Sample obj = (Sample) context.getBean("helloBean");
            obj.printHello();

            School schObjOne = (School) context.getBean("schoolBean");
            String messageOne = schObjOne.WelcomeMessage();
            System.out.println("Welcome message in APP.java file .....:  "+messageOne);

            School schObjTwo = (School) context.getBean("schoolBean");
            String messageTwo = schObjTwo.WelcomeMessage();
            System.out.println("Welcome message in APP.java file .....:  "+messageTwo);

            schObjOne.setSchoolcode(300);
            System.out.println("schObjTwo.welcomeMessage() :::::: "+schObjTwo.WelcomeMessage());
            schObjTwo.setSchoolName("GGHSS");
            System.out.println("schObjOne.welcomeMessage() :::::: "+schObjOne.WelcomeMessage());


        }
}
