package lab2;

import java.util.*;

public class L2_ex_4 {

	static int[] modify_Array(int[] arr) {
		int n=arr.length;
		int[] arr_new=new int[n];
		int i,j=0;
		Arrays.sort(arr);
		for(i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr_new[j++]=arr[i];
			}
			
		}
		arr_new[j++]=arr[n-1];
		int[] res_arr=new int[j];
		for(i=0;i<j;i++) {
			res_arr[i]=arr_new[j-i-1];
		}
		return res_arr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		int[] sort_arr=modify_Array(arr);
		for(int i=0;i<sort_arr.length;i++) {
			System.out.println(sort_arr[i]);
		}

	}

}
