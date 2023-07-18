package interview;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		int arr[]= {2,3,7,4,8};
		/*
		for (int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+",");
			
		}
		*/
		
		
		/*
		 * int i=0; while ( i<arr.length) { System.out.print(arr[i]+","); i++; }
		 */
		
		
		
		  for (int i : arr) { System.out.print(i+","); }
		 
		
	}
}
