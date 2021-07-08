package com.bl.birdsanctuary;

public class Duck extends Bird {
	
	public Duck(String id) {
		this.id = id;
		color = "White";
		name = "Duck";
	}
	public Duck() {
		color = "White";	
		name = "Duck";
	}
    
	@Override
	public void fly() {
    	System.out.println("Duck is flying");
    }
    
	@Override
	public void swim() {
    	System.out.println("Duck is swimming");
    }
    
} 

