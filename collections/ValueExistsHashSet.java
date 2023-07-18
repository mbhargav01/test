package collections;

import java.util.HashSet;

public class ValueExistsHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(4);
		hs.add(5);
		hs.add(22);
		hs.add(77);
		
		if(hs.contains(77))
			System.out.println("77 value is found.");
		else {
			System.out.println("Value not found.");
		}

	}

}
