package lab1;

import java.util.*;

public class L1_ex_7 {
	
	static boolean checkNumber(int n) {
		boolean flag=true;
		int dig1=n%10,dig2;
		n/=10;
		while(n>0) {
			dig2=n%10;
			if(dig1<dig2) {
				flag=false;
				break;
			}
			else {
				dig1=dig2;
				n/=10;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		System.out.println(checkNumber(n));

	}

}
