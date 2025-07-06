package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
    	
    	System.out.println("Here modified and configured the existing Library Management project created for exercise 1: and implemented constructor and setter injecttion");
    	System.out.println();
    	
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.displayBooks(); // Should work if DI was successful
        
    }
}
