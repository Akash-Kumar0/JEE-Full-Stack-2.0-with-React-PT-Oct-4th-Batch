package lab_1;

import java.util.*;

public class L1_ex_3 {
	//non-recursive
	int fib_non_rec(int n) {
		int n1=1,n2=1,nth_num=0;
		if(n==1 || n==2) {
			return n1;
		}
		if(n<1) {
			System.out.println("invalid input");
		}
		
		while(n>2){
			nth_num=n1+n2;
			n2=n1;
			n1=nth_num;
			n--;
		}
		return nth_num;
	}
	//recursive
	int fib_rec(int n) {
		int n1=1,n2=1,nth_num=0;
		if(n==1 || n==2) {
			return n1;
		}
		return fib_rec(n-1) + fib_rec(n-2);
	
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter nth fibonacci series number : ");
		int n=sc.nextInt();
		L1_ex_3 obj_1=new L1_ex_3();
		System.out.println("Nth fib number without recursion is : "+obj_1.fib_non_rec(n));
		System.out.println("Nth fib number with recursion is : "+obj_1.fib_rec(n));
		
	}

}
