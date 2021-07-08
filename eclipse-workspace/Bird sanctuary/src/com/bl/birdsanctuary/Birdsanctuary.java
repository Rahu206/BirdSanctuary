package com.bl.birdsanctuary;

public class Birdsanctuary {
public static void main(String args[]) {
	System.out.println("Welcome to Birdsanctuary");
	Bird duck= new Duck("d1");
	Bird parrot= new Parrot("p1");
	Bird penguin= new Penguin("pn1");
	Bird pigeon= new Pigeon("pig1");
	
	BirdsanctuaryManager dataManager = new BirdsanctuaryManager();
	
	dataManager.add(duck);
	dataManager.add(parrot);
	dataManager.add(penguin);
	dataManager.add(pigeon);
	
	dataManager.print();
	
	dataManager.remove(pigeon);
		System.out.println("This is remove method");
	dataManager.print();
}
}
