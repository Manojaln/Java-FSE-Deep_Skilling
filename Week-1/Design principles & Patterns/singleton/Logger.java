package com.singleton;

public class Logger {
	//step 1 : Here i'm declaring a static variable
    private static Logger a;

 // in step-2 I had declare a static constructor to restrict object creation by other class
    private Logger() {

    }

 // here i created a static method to create a instance
    public static Logger getObj() {
        if (a == null) {
            a = new Logger();
        }
        return a;
    }
}
