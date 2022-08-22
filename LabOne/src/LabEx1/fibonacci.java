package LabEx1;
import java.util.*;

public class fibonacci {
	
	static int fibo(int num) {
		
		int a =1, b = 1, c;
		
		for(int i=1;i<num-1;i++) {
			
			int temp = a;
			a = b;
			b = temp + b;
		}
		return b;
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int lastnum = fibo(number);
		System.out.print(lastnum);	
	}

}
