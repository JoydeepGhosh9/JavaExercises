package Lab3ex;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class displayItemsfromText {

	public static void main(String[] args) throws Exception {
		 
		FileReader fr = new FileReader("C:\\Users\\Joydeep Ghosh\\eclipse-workspace\\LabThree\\src\\Lab3ex\\read.txt");
		BufferedReader reader = new BufferedReader(fr);
		
		int i;
		int words = 0, lines =0, characters=0;
		while((i=reader.read()) != -1){
			if( i== 32) {
				words++;
			}
			else if(i == 13) {
				lines++;
			}
			System.out.print((char)i);
			characters++;

	}
		System.out.println(words);
		System.out.println(lines);
		System.out.println(characters-words);
	}
	

}
