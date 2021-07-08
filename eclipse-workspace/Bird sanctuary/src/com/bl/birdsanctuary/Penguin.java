package com.bl.birdsanctuary;

public class Penguin extends Bird {
	public Penguin(String id) {
		this.id = id;
		color = "Black";
		name = "Penguin";
}	
	public Penguin() {
		color = "Black";	
		name = "Penguin";
	}
    
	@Override
	public void fly() {
    }
    
	@Override
	public void swim() {
		System.out.println("Penguin is swimming");
    }
    
}
