package interview;

public class Triangle {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int k=5-i;k>=1;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				
				//if(j==1 || j==i) { System.out.print("*"+" "); }
				 
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
