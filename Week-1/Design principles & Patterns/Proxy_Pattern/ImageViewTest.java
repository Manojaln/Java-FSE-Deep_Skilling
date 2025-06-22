package com.pack;

public class ImageViewTest {
	public static void main(String[] args) {
		Image img1=new ProxyImage("lanscape.jpg");
		// First call will load from server
		img1.display();

        System.out.println("\nUser navigates away and comes back...\n");

        // Second call uses cached image
        img1.display();
	}
}
