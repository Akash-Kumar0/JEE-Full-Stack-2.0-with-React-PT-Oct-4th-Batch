package lab6;

import java.util.*;

public class L6_ex_4 {

	public static HashMap<Integer,String> getStudents(HashMap<Integer,Integer>mp) {
		List<Map.Entry<Integer,Integer>> list=new ArrayList<>(mp.entrySet());
		HashMap<Integer,String> new_map=new HashMap<>();
		for(Map.Entry<Integer,Integer> i:list) {
			if(i.getValue()>=90) {
				new_map.put(i.getKey(),"Gold");
			}
			else if(i.getValue()>=80 && i.getValue()<90) {
				new_map.put(i.getKey(),"Silver");
			}
			else if(i.getValue()>=70 && i.getValue()<80) {
				new_map.put(i.getKey(),"Bronze");
			}
			else {
				new_map.put(i.getKey(),"Not Elible");
			}
			
		}
		
		return new_map;
	}
	
	public static void main(String[] args) {
		HashMap<Integer,Integer> mp=new HashMap<>();
		mp.put(10034,90);
		mp.put(10011,70);
		mp.put(10038,80);
		mp.put(10042,65);
		mp.put(10006,85);
		mp.put(10025,75);
		mp.put(10028,95);
		mp.put(10016,53);
		System.out.println(getStudents(mp));
	}
}
