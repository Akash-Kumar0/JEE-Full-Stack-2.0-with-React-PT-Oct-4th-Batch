package lab3;

import java.util.*;

public class L3_ex_8 {

	static boolean alterString(String str) {
		boolean flag=true;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i) > str.charAt(i+1)) {
			flag=false;
			break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(alterString(str));
	}

}
