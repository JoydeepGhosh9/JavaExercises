package LabSeven;

import java.lang.invoke.StringConcatFactory;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Excercise1 {
	
	
	@SuppressWarnings("unchecked")
	public static List sort(HashMap<String, Integer> map) {
		
		List<String> newmap = new ArrayList<>();
		List<String> list = new ArrayList<>();
		for(String s : map.keySet()) {
			
			list.add(s);
			
		}
		Collections.sort(list);
		
		for(String letter : list) {
			newmap.add(letter+"="+map.get(letter));
		}
		
		return newmap;
		
		
	}

	public static void main(String[] args) {
	
		
		HashMap <String, Integer> map = new HashMap<>();
		map.put("a", 5);
        map.put("e", 6);
        map.put("d", 8);
        map.put("p", 10);
        map.put("v", 10);
        map.put("m", 10);
        map.put("i", 10);
        map.put("s", 10);
        
        ArrayList newmap = (ArrayList) sort(map);
        System.out.println(newmap);
        

	}

}

//string manipulation 
//excetion handling 
//collections 


//Set<Entry<String,Integer>> entries = map.entrySet();
//for(Entry<String, Integer> en : entries  ) {
//	System.out.println(en);
//}
//System.out.println(entries);