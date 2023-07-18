package arrays;

public class ArrSame{

	public static void main(String[] args) {
		
		int num1[]= {10,5,34,24,90};
		int num2[]= {24,5,10,34,90};
		int size=0,temp=0;
		if (num1.length==num2.length) {
			size=num1.length;
		}
		else {
			System.out.println("Both Arrays are not same.");
			System.exit(0);
			
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(num1[i]==num2[j] && num1.length==num2.length) {
					temp++;
				}
			}
		}
		
		if(temp==size) 
		System.out.println("Both Arrays are same.");
		else {
			System.out.println("Both Arrays are not same.");
		}
		
	}
}