package com.pack;

public class ProxyImage implements Image{
	private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("[Proxy] Image not loaded yet. Loading now...");
            realImage = new RealImage(fileName); // Lazy initialization
        } else {
            System.out.println("[Proxy] Using cached image.");
        }
        realImage.display();
    }
}
