package lab6;

import java.util.*;
import java.util.Map.Entry;

public class L6_ex_1 {

	public static List getValues(Map<String, Integer> hsm) {
		List <Map.Entry<String,Integer>> list=new ArrayList<Map.Entry<String,Integer>>(hsm.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){
			public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2) {
				return (o1.getValue().compareTo(o2.getValue()));
			}
		});
		List<Integer> sorted=new ArrayList();
		for(Map.Entry<String,Integer> i:list) {
			sorted.add(i.getValue());
		}
		return sorted;
	}
	
	public static void main(String[] args) {
		Map<String,Integer> hsm=new HashMap<>();
		hsm.put("ram", 2);
		hsm.put("ravi", 5);
		hsm.put("sita", 2);
		hsm.put("dinesh", 4);
		hsm.put("preet", 3);
		System.out.println(getValues(hsm));
		System.out.println(hsm);
	}
}
