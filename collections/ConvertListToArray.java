package collections;

import java.util.ArrayList;

public class ConvertListToArray {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Manish");
		al.add("Mahesh");
		al.add("Ramesh");
		al.add("Suresh");
		
		//String[] arr=new String[al.size()];
		
//		for(int i=0;i<al.size();i++) {
//			arr[i]=al.get(i);
//		}
		
		String[] arr=al.toArray(new String[al.size()]);
		

		for (String s : arr) {
			System.out.println(s);
			
		}
	}

}
