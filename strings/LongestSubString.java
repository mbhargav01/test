package strings;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		String s="mannishamina";
		HashSet<Character> set=new HashSet<>();
		String longestOverall="";
		String longestTillnow="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(set.contains(c)) {
				longestTillnow="";
				set.clear();
			}
			longestTillnow+=c;
			set.add(c);
			
			if(longestTillnow.length()>longestOverall.length()) {
				longestOverall=longestTillnow;
			}
		}
		System.out.println(longestOverall);
	}

}
