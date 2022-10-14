package lab1;

import java.util.*;

public class L1_ex_8 {

	static boolean checkNumber(int n){
		int rem=0;
		boolean flag=true;
		while(rem==0) {
			if(n%2!=0) {
				flag=false;
				break;
			}
			n/=2;
			if(n==1)
				break;
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
