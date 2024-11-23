package com.excelr.springproject.springprj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excelr.resources.SpringConfig;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
    	
    	
    	Student s1=(Student) context.getBean("std1");
    	System.out.println(s1);
    	//printing the bean
    	
    }
}
