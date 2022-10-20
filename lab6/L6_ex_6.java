package lab6;

import java.util.*;

public class L6_ex_6 {

	public static List<Integer> votersList(Map<Integer,Integer>mp) {
		List<Map.Entry<Integer,Integer>> list=new ArrayList<>(mp.entrySet());
		List<Integer> lst=new ArrayList<>();
		for(Map.Entry<Integer,Integer> i:list) {
			if(i.getValue()>18) {
				lst.add(i.getKey());
			}
		}
		return lst;
	}
	
	public static void main(String[] args) {
		Map<Integer,Integer> mp=new LinkedHashMap<>();
		mp.put(1023,24);
		mp.put(1087,12);
		mp.put(1003,38);
		mp.put(1045,18);
		mp.put(1033,76);
		mp.put(1025,51);
		
		System.out.println(votersList(mp));
	}

}
