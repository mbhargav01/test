package strings;

public class CompareString {

	public static void main(String[] args) {
		String s1="Manish";
		String s2="Harish";
		boolean isCompare=false;
		
		for(int i=0;i<s1.length();i++) {
			if(s1.length()!=s2.length()) {
				isCompare=false;
				break;
			}
			if(s1.charAt(i)!=s2.charAt(i)) { 
				isCompare=false;
				break;
			}else 
			isCompare=true;
			
		}
		System.out.println("Both Strings are equal: "+isCompare);

	}

}
