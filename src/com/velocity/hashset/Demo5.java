package com.velocity.hashset;

import java.util.HashSet;

public class Demo5 {

	// Design method which return hashset object to that method
		public HashSet<Integer> getHashSet() {
			HashSet<Integer> hs = new HashSet<Integer>();
			hs.add(10);
			hs.add(20);
			hs.add(30);
			hs.add(40);
			return hs;
		}

		public static void main(String[] args) {

			Demo5 hashSetDemo6 = new Demo5();
			HashSet<Integer> hs1 = hashSetDemo6.getHashSet();
			System.out.println(hs1);
		}

}
