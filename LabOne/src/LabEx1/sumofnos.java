package LabEx1;
import java.util.*;

public class sumofnos {
	
	static int calculateSum(int n) {
		
		int sum = 0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum = sum +i;
			}
		}
		return sum;
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print(calculateSum(number));
    }

}
