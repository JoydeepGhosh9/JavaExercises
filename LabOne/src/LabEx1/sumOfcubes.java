package LabEx1;

import java.util.*;

public class sumOfcubes {
	
	static int summation(int num)
	{
		int sum = 0, newnum=0;
		while(num>0)
	    {
		newnum = num%10;
		sum = sum + (newnum*newnum*newnum);
		num = num/10;
		
	    }
	    return sum;
	    }
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of your choice");
		int number = sc.nextInt();
		int totalsum = summation(number);
		System.out.print("the sum of the cubes of a digit is " + totalsum);
		
	}
}

