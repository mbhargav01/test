package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class InitializeHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<>();
		//System.out.println("HashMap is empty?-"+(hm.size()==0));
		hm.put(21, "Manish");
		hm.put(32, "Ramesh");
		hm.put(83, "Suresh");
		hm.put(14, "Mahesh");

		//System.out.println("HashMap is empty?-"+hm.isEmpty());
		
		Set<Integer> keys=hm.keySet();
		
//		for(int key:keys) {
//			
//			System.out.println(key+"=="+hm.get(key));
//		}
		
		//Before-Sort
		System.out.println("Original:");
		Iterator<Integer> i=keys.iterator();
		while (i.hasNext()) {
			int key=i.next();
			System.out.println(key+"=="+hm.get(key));
			
		}
		
		//After-Sort
		System.out.println("After Sorting:");
		Map<Integer, String> map=new TreeMap<>(hm);
		Set<Integer> keys1=map.keySet();
		Iterator<Integer> it=keys1.iterator();
		while (it.hasNext()) {
			int key=it.next();
			System.out.println(key+"=="+hm.get(key));
			
		}
		
	}

}
