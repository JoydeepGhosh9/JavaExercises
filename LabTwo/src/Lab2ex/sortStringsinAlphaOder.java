package Lab2ex;

import java.util.*;

public class sortStringsinAlphaOder {
	
	 static String sortString(char n[]) {
		 
		 for(int i=0;i<n.length;i++) {
		 for(int j=0;j<n.length;j++) {
			 
			 
			 if(n[j]>n[i]) {
				 char temp = n[i];
				 n[i] = n[j];
				 n[j] = temp;	 
			 }
		 }
		 }
		 for(int i=0;i<n.length/2;i++) {
			 n[i] = Character.toUpperCase(n[i]);
		 }
		 return String.valueOf(n);	 
	 }
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = new String("joydzxep");
		char[] nam = name.toCharArray();
		String name2 = sortString(nam);
		System.out.println(name2);

	}

}
