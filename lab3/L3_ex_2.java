package lab3;

import java.util.*;

public class L3_ex_2 {

	static String getImage(String str) {
		StringBuffer str_bf=new StringBuffer(str);
		String rev_str=str_bf.reverse().toString();
		return str+"|"+rev_str;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(getImage(str));
	}

}
