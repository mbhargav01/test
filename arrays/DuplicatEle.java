package arrays;

public class DuplicatEle {

	public static void main(String[] args) {
		//Array sort-->
		int num[]= {10,5,10,34,24,90,24,70,10,100,112,100};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.print(num[i]+" ");
				}
			}
		}
	}
}