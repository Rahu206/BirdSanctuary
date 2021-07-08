package com.bl.birdsanctuary;

import java.util.ArrayList;
import java.util.List;

public class BirdsanctuaryManager{
	List<Bird> birdList = new ArrayList();
	
	public void add(Bird bird) {
		birdList.add(bird);
	}
	
	public void remove(Bird bird) {
		birdList.remove(bird);	
	
	}
	public void print() {
		for(Object bird: birdList)
			System.out.println(bird);
  	  }
   }	
