package com.singleton;

public class MainTest {
	public static void main(String[] args) {

		System.out.println("Here I created a three instance ,Where all the three instance holds the same memory location ");
        Logger log1 = Logger.getObj();
        Logger log2 = Logger.getObj();
        

        // Check if both logger instances are the same
        if (log1 == log2) {
        	System.out.println(System.identityHashCode(log1));
    		System.out.println(System.identityHashCode(log2));
            System.out.println("Both logger1 and logger2 refer to the same instance as :"+log1 +" " +log2);
        } else {
            System.out.println("Different instances! Singleton pattern failed.");
        }
    }
}
