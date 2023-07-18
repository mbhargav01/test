package strings;

public class CountCharacters {

	public static void main(String[] args) {
		String s="Hello World";
		char[] ch=s.toCharArray();
		String temp="";
		for(int i=0;i<ch.length;i++) {
			
			while(i<ch.length && ch[i]!=' ') {
				temp=temp+ch[i];
				i++;
			}
			if(temp.length()>0)
				System.out.println(temp+"->"+temp.length());
			temp="";
		}

	}

}
