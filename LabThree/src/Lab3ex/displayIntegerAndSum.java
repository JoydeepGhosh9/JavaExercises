package Lab3ex;

import java.util.*;

public class displayIntegerAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		StringTokenizer sc = new StringTokenizer("1 4 45 74 8 10");
		while(sc.hasMoreTokens()) {
			
			String number = sc.nextToken();
			System.out.println(number);
			
			sum = sum + Integer.parseInt(number);
		}
		System.out.println("the sum is " + sum);
	}

}
