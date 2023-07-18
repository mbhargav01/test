package collections;

import java.util.HashSet;
import java.util.Iterator;

public class TraverseHashSet {

	public static void main(String[] args) {
	
		HashSet<String> hs=new HashSet<>();
		hs.add("Manish");
		hs.add("mannu");
		hs.add("laxmi");
		hs.add("ram");
		
//		//Using-Iterator
//		Iterator<String> i=hs.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}

		//Using-foreachloop
		for (String str:hs) {
			System.out.println(str);	
		}
	}

}
