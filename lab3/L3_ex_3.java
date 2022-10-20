package lab3;

import java.util.*;

public class L3_ex_3 {

	static boolean isVowel(char ch) {
		if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
			return false;
		}
		else
			return true;
	}
	
	static String alterString(String str) {
		str=str.toLowerCase();		
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(!isVowel(arr[i])) {
				if(arr[i]=='z') {
					arr[i]='b';
				}
				else {
					arr[i]=(char)(arr[i]+1);
					if(isVowel(arr[i])) {
						arr[i]=(char)(arr[i]+1);
					}
				}
				
			}
		}
		return String.valueOf(arr);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(alterString(str));

	}

}
