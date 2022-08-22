package LabEx1;

import java.util.Scanner;

public class increassingnumber {
	
	static String checknumber(int n) {
		
		int num, num1;
		
		while(n>9) {
			num = n% 10;
			num1 = (n %100 - num)/10 ;
			if(num>num1) {
				n = n/10;
				num = 0;
				num1= 0;
			}
			else {
				return "False";
			}
		}
		return "True";
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print(checknumber(number));
	}
}
