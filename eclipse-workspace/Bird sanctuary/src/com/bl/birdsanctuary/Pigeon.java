package com.bl.birdsanctuary;

public class Pigeon extends Bird{
	
	public Pigeon(String id) {
		this.id = id;
		color = "Gray";
		name = "Pigeon";
}	
	
	public Pigeon() {
		color = "Gray";	
		name = "Pigeon";
	}
	@Override
	public void fly() {
    	System.out.println("Piegon is flying");
    }
    
	@Override
	public void swim() {
    }

}
