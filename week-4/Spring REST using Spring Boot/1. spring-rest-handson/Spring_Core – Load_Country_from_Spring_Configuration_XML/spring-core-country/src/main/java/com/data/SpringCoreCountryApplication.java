package com.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreCountryApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCoreCountryApplication.class);

    public static void main(String[] args) {
        displayCountry();
    }

    public static void displayCountry() {
        System.out.println("Starting application...");

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            Country country = context.getBean("country", Country.class);
            System.out.println("Country: " + country.toString());
        } catch (Exception e) {
            // Print the full stack trace so we can diagnose the issue
            e.printStackTrace();
        }
    }


}
