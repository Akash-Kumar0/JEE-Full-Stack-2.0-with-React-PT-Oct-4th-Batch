package lab6;

import java.util.*;

public class L6_ex_2 {
	
	public static Map<Character,Integer> countChars(char[] arr){
		Map<Character,Integer> mp=new LinkedHashMap<>();
		for(char i:arr) {
			if(mp.containsKey(i)) {
				mp.put(i,mp.get(i)+1);
			}
			else {
				mp.put(i,1);
			}
		}
		return mp;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		System.out.println(countChars(arr));
	}

}
