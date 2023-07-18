package collections;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
		
		Integer[] num= {10,20,30,40};
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<num.length;i++) {
			
			list.add(num[i]);
		}
		
		//Collections.addAll(list, num);
		
		for(Integer n:list) {
			System.out.println(n);
		}

	}

}
