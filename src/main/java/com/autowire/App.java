package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
    ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
  //  context.getBean("human" , Human.class).startPumping();
   // context.getBean("humanfortype" ,Human.class).startPumping();
    
    context.getBean("humanforContructorAutowiring" ,Human.class).startPumping();
    }
    
}
