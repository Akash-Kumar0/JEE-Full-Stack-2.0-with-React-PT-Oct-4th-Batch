package lab_1;

import java.util.*;

public class L1_ex_1 {
	
	static int sum_of_cube_of_digits(int n,int num){
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=Math.pow((num%10),3);
			num/=10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of digits : ");
		int n=sc.nextInt();
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		System.out.println("Sum of the cube of digits of the number is: " + sum_of_cube_of_digits(n,num));
	}
	
}
