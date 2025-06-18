package com.basic.singleton;

public class BasicSingletonImpl {
	//step 1 : Here i'm declaring a static variable
	private static BasicSingletonImpl a;
	
	// in step-1 I had declare a static constructor to restrict object creation by other class
	private BasicSingletonImpl() {
		
	}
	
	// here i created a static method to create a instance
	public static BasicSingletonImpl getObj() {
		if(a==null) {
			a = new BasicSingletonImpl();
			
		}
		return a;
	}
	
	public static void main(String[] args) {
		BasicSingletonImpl obj1 = BasicSingletonImpl.a;
		BasicSingletonImpl obj2 = BasicSingletonImpl.a;
		BasicSingletonImpl obj3 = BasicSingletonImpl.a;
		System.out.println("Here I created a three instance ,Where all the three instance holds the same memory location ");
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(System.identityHashCode(obj3));
	}
	
		
}
