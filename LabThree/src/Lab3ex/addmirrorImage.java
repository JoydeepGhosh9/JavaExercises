package Lab3ex;

import java.util.Scanner;

public class addmirrorImage {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.print(s.append(word)+ "|"+ s.reverse());
		sc.close();

	}

}
