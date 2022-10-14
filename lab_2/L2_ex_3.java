package lab2;

import java.util.*;

public class L2_ex_3 {

	static void bubble_sort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int flag=0;
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
	}
	
	static int[] getSorted(int[] arr) {
		int n=arr.length;
		StringBuffer[] str=new StringBuffer[n];
		for(int i=0;i<n;i++) {
			StringBuffer ele=new StringBuffer();
			arr[i]=Integer.parseInt(ele.append(String.valueOf(arr[i])).reverse().toString());
		}
		bubble_sort(arr);
		return arr;
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
		int[] sort_arr=getSorted(arr);
		for(int i=0;i<n;i++) {
			System.out.println(sort_arr[i]);
		}
		

	}

}
