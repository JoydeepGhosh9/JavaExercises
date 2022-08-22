package LabEx1;

import java.util.*;

public class trafficLight {
	
	static String trafficSignal(String signal) {
		
		if(signal.equals("red")) 
			return "Stop";
		else if(signal.equals("yellow"))
			return "Ready";
		else if(signal.equals("green"))
			return "Go";
		else 
			return "invalid Input";
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String choice = sc.nextLine();
		
		String action = trafficSignal(choice.toLowerCase());
		System.out.println(action);

	}

}
