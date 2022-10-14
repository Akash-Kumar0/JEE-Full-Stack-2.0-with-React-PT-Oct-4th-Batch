package lab_1;

import java.util.*;

public class L1_ex_6 {

	static int calculateDifference(int n) {
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++) {
			sum1+=i*i;
			sum2+=i;
		}
		return sum1-(sum2*sum2);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n=sc.nextInt();
		System.out.println(calculateDifference(n));
	}

}
