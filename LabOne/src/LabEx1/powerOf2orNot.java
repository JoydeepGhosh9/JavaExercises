package LabEx1;

import java.util.Scanner;

public class powerOf2orNot {
	
	static boolean checkNumber(int n) {
		
		while(n>1) {
			if(n%2==0) {
				n = n/2;
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print(checkNumber(number));
	}

}
