package Lab3ex;
import java.util.*;

public class checkpositiveString {
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter line");
		String str= new String(in.nextLine());
		
		// length of the string
        int n = str.length();
        for (int i = 0; i < n-1; i++) {
           if( str.charAt(i) > str.charAt(i+1)) {
        	   System.out.println("not increasing");
        	   return;
        }
        }
        System.out.println("increasing");
	}
}


