package lab_2;

import java.util.*;

public class L2_ex_1 {
	
	int getSecondSmallest(int[] arr) {
		int n=arr.length,i,j,k;
		for(i=0;i<2;i++) {
			for(j=k=i;j<n-1;j++) {
				if(arr[j+1]<arr[k]) {
					k=j+1;
				}
			}
			int temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
		}
		return arr[1];
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements : ");
		int n=sc.nextInt(),i;
		int [] arr=new int[n];
		for(i=0;i<n;i++) {
			int ele=sc.nextInt();
			arr[i]=ele;
			
		}
		L2_ex_1 obj1=new L2_ex_1();
		System.out.println(obj1.getSecondSmallest(arr));
	}

}
