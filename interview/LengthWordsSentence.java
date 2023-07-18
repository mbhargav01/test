package interview;

import java.util.Scanner;

public class LengthWordsSentence {

	public static void main(String[] args) {
		
		System.out.println("Enter the sentence");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		str=str+" ";
		int start=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c==' ')
			{
				String word=str.substring(start,i);
				//System.out.println(word+" - "+word.length());
				char chars[]=word.toCharArray();
				for(int j=chars.length-1;j>=0;j--)
				{
					System.out.print(chars[j]);
				}
				System.out.print(" ");
				start=i+1;	
			}
		}
		scanner.close();
	}

}
