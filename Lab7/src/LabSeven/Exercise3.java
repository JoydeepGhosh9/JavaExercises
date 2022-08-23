package LabSeven;
import java.util.*;

public class Exercise3 {
	
	public static Map getSquares(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int a : arr) {
			map.put(a,a*a);
		}
		return map;
	}

	public static void main(String[] args) {
		
		int arr[] = {3,5,6,12,45,9};
		System.out.println("The number and thier squares are:- ");
		
		System.out.println(getSquares(arr));
	}

}
