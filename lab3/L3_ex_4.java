package lab3;

import java.util.*;

public class L3_ex_4 {

	static int newNumber(int num) {
		String str=String.valueOf(num);
		StringBuffer sb=new StringBuffer();
		int i;
		for(i=0;i<str.length()-1;i++) {
		 sb.append(Math.abs(Integer.parseInt(String.valueOf(str.charAt(i))) - Integer.parseInt(String.valueOf(str.charAt(i+1)))));
		}
		sb.append(String.valueOf(str.charAt(i)));
		num=Integer.parseInt(sb.toString());
		return num;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(newNumber(num));
	}

}
