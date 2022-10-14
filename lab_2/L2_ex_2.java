package lab2;

import java.util.*;

public class L2_ex_2 {

	static String[] sortStrings(String[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			arr[i]=arr[i].toLowerCase();
		}
		Arrays.sort(arr);
		if(n%2==0) {
			for(int i=0;i<n/2;i++) {
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=n/2;i<n;i++) {
				arr[i]=arr[i].toLowerCase();
			}
		}
		else {
			for(int i=0;i<n/2+1;i++) {
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=n/2+1;i<n;i++) {
				arr[i]=arr[i].toLowerCase();
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++){
			String str=sc.next();
			arr[i]=str;
		}
		String[] sort_arr=sortStrings(arr);
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}	
	}
}
