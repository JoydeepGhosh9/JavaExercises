package LabEx1;

import java.util.Scanner;

public class primenos {
	
	static int prime(int num) {
		
		int c = 0;
			for(int j=1;j<num;j++) {
				if(num%j==0) {
					 c = c+1;
				}
			}
			if(c==1) {
				return num;
			}
			return 0;
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i=2;i<=number;i++) {
		if(prime(i)>0) {
		System.out.println(prime(i));
		}
       }
    }
}
