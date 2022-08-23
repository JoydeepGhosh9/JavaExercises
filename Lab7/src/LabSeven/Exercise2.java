package LabSeven;

import java.util.*;
import java.util.Arrays;

public class Exercise2 {
	public static Map countChars(char arr[]) {
		
		int i=0,j=0,c=0;
		Map<Character, Integer> count = new HashMap<>();
		

		
	    for (Character character : arr) {
	        Integer characterCount = count.get(character);
	        if(characterCount == null) {
	            characterCount = 0;
	        }
	        characterCount++;
	        count.put(character, characterCount);
	    }

	    return count;
	}
	
	public static void main(String[] args) {
		
	 char num[] = {'a','c','b','x','a','a'};
	 
	 System.out.println(countChars(num));
	}

}
