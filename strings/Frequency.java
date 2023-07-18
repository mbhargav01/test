package strings;

import java.util.Map;
import java.util.TreeMap;

public class Frequency {

	public static void main(String[] args) {
		String str="naaveen";
		
		TreeMap<Character,Integer> map=new TreeMap<>();
		for(int i=0;i<str.length();i++) {
			Integer c=map.get(str.charAt(i));
			
			if(map.get(str.charAt(i))==null) {
				map.put(str.charAt(i),1);
			}else {
				map.put(str.charAt(i), ++c);
			}
		}
		for(Map.Entry entry:map.entrySet()) {
			System.out.println("Character="+entry.getKey());
			System.out.println("Frequency="+entry.getValue());
		}

	}

}
