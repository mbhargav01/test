package strings;

public class ReverseRecursion {

	public static void main(String[] args) {
		String s="Manish";
		System.out.println(revString(s));
	}
	
	private static String revString(String s) {
			if(s==null || s.length()<=1) {
				return s;
			}
		return revString(s.substring(1))+s.charAt(0);
	}

}
