package collections;

import java.util.ArrayList;

public class TraverseArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(7);
		al.add(19);
		al.add(4);
		al.add(11);
		al.add(12);
		
		for(Integer arr:al) {
			System.out.println(arr);
		}
		
//		Iterator<Integer> it=al.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());	
//		}
		
//		ListIterator<Integer> li=al.listIterator();
//		while (li.hasNext()) {
//			System.out.println(li.next());
//		}

	}

}
