package collections;

import java.util.ArrayList;

public class ValueExistsArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(3);
		al.add(7);
		al.add(11);
		al.add(0);
		al.add(9);
		
		if(al.contains(11))
			System.out.println("11 was found in ArrayList.");
		else {
			System.out.println("11 was not found.");
		}

	}

}
