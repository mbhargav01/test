package strings;

public class StringSplit {

	public static void main(String[] args) {
		String s="091-1234567890";
		String str[]=s.split("-");
		for(String string:str)
			System.out.println(string);
	}

}
