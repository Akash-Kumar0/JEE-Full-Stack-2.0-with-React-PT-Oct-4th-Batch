package lab6;

import java.util.*;

public class L6_ex_7 {

	public static int[] getSorted(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			StringBuffer sb=new StringBuffer();
			arr[i]= Integer.parseInt(sb.append(String.valueOf(arr[i])).reverse().toString());
		}
		List<Integer> lst=new ArrayList<>();
		for(int i:arr) {
			lst.add(i);
		}
		Collections.sort(lst);
		for(int i=0;i<lst.size();i++) {
			arr[i]=lst.get(i);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i:getSorted(arr)) {
			System.out.println(i);
		}
		

	}

}
