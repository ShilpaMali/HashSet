package com.velocity.hashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		Set hs=new LinkedHashSet();
		
		//add()method
		hs.add(15);
		hs.add(50);
		//hs.add(15);    //duplicate element
		hs.add(25);
		hs.add(80);
		hs.add("pune");  //heterogenous object
		hs.add("null");   //null insertion
		
		//1 st way : Direct Way
		System.out.println(hs);
		
	}

}
