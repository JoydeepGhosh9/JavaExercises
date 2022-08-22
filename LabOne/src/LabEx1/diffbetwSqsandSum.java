package LabEx1;
import java.util.*;

public class diffbetwSqsandSum {
	
	static int calculateDifference(int n) {
		
		int sum=0 , sum1=0;
		for(int i=0;i<=n;i++) {
			sum = sum + (i*i);
			sum1 = sum1 + i;
		}
		return  (sum1*sum1) - sum ;
		
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print(calculateDifference(number));
	}

}
