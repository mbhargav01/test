package arrays;

public class Array2Low {

	public static void main(String[] args) {
		
	int arr[]= {32,10,8,1,6,9};
	int min=arr[0];
	int smin=arr[1];
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			smin=min;
			min=arr[i];
		}else if(arr[i]<smin){
			smin=arr[i];
		}
	}
	System.out.println("2 smallest is : "+smin);
	}

}
