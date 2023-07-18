package interview;

public class Second {

	public static void main(String[] args) {
		
		int arr[]= {1,7,7,7,0,2,4,4};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]>arr[i+1] || arr[i+1]>arr[i])
			{
				temp=arr[i];
				
			}
			
		}
		System.out.print(temp);
	}

}
