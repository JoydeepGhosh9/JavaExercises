package myfirst;
import java.io.BufferedReader;
import java.math.*;

import java.util.Scanner;

//class Cylinder{
//	
//	public double radius;
//	public double height;
//	
//	public double surfaceArea() {
//		
//		double area =  (2*Math.PI*radius*height);
//		return area;
//	}
//	public double volume() {
//		
//		double vol = Math.PI*radius*radius*height;
//		return vol;
//	}

class Super{
	
	public void  method1() {
		System.out.println("Dynamic");
	}
	public void method2() {
		System.out.println("Method");
	}

}

class Sub extends Super{
	@Override
	public void method1() {
		System.out.println("Dispatch");
	}
	
	void method3() {
		System.out.println("Exampke");
	}
}


public class MyFirst {

	public static void main(String[] args) {
		
//		
//		Cylinder c = new Cylinder();
//		c.radius = 7;
//		c.height = 10;
//		System.out.println(c.surfaceArea());
//		System.out.println(c.volume());
//		
		
//		StringBuffer s = new StringBuffer("Hello");
//		StringBuffer a = s;
//		
//		System.out.println(a);
//		
//		System.out.print(s);
//		
		
		
		Super s = new Sub();
		s.method1();
		s.method2();
		s.method3();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//        Scanner sc = new Scanner(System.in);
//		
//		int arraySize = sc.nextInt();
//		int arr[] = new int[arraySize];
//		
//		for(int i=0;i<arraySize;i++){
//			arr[i] = sc.nextInt();
//		}
//	
//	
//	for(int x:arr) {
//		System.out.println("here are the values " + x);
	}
//    System.out.print(11 + 12 + " hello " );
}
	
	
