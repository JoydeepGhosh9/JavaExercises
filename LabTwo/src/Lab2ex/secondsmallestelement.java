package Lab2ex;

import java.lang.reflect.Array;
import java.util.*;
public class secondsmallestelement {
	
	static int getSecondsmallest(int n[]) {
		
//		int max = n[0], max2=n[0];
//		
//		for(int i=1;i<n.length;i++) {
//			
//			if(n[i]<max) {
//				max2 = max;
//				max = n[i];
//		}
//			else if(n[i]<max2) {
//				max2 = n[i];
//			}
//		
//	}
//		return max2;
		
		for(int i=0;i<n.length;i++) {
			 for(int j=0;j<n.length;j++) {
				 
				 
				 if(n[j]>n[i]) {
					 int temp = n[i];
					 n[i] = n[j];
					 n[j] = temp;	 
				 }
			 }
			 }
		
//		Arrays.sort(n);
		System.out.println(" second smallest element " + n[1]);
		return n[1];
}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int arraySize = sc.nextInt();
		int arr[] = new int[arraySize];
		
		for(int i=0;i<arraySize;i++){
			arr[i] = sc.nextInt();
		}
//		
//		int a[] = {8,34,45,2,80,243,6};
		int smallestelement = getSecondsmallest(arr);
		System.out.println("Second smallest element is "+ smallestelement);
		
		for(int x:arr) {
			System.out.println(x);
		}
	}
}


