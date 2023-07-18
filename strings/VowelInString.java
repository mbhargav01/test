package strings;

public class VowelInString {

	public static void main(String[] args) {
		String s="Manish Bhargav";
		char[] ch=s.toCharArray();
		int count=0;
		
		for(int i=0;i<ch.length;i++) {
			switch(ch[i]) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println("Number is vowels in given string is: "+count);

	}

}
