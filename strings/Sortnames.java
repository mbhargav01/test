package strings;

public class Sortnames {

	public static void main(String[] args) {
		String[] names= {"Banana","Grapes","Apple"};
		String temp="";
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].compareTo(names[j])>0) {
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		for(String name:names) {
			System.out.println("Sorted Array: "+name);
		}

	}

}
