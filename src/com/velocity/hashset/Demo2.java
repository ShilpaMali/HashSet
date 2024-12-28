package com.velocity.hashset;

import java.util.HashSet;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		// how to add elements into hashset
		hs.add(15);
		hs.add(50);
		hs.add(25);
		hs.add(80);
		//3rd way- for each loop
		for(Object obj:hs) {
			System.out.println(obj);
		}

	}

}
