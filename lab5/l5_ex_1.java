package lab5;

import java.util.*;

public class l5_ex_1 {

	public static void main(String[] args) throws AgeException {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
			if(age<15) {
				throw new AgeException("Age should not be less than 15");
			}
		}
		catch(AgeException e) {
			e.printStackTrace();
		}
		String first_name=sc.next();
		String second_name=sc.next();
		try {
			if(first_name==null || second_name==null) {
				throw new NameException("First Name or Last Name should not be null");
			}
		}
		catch(NameException e) {
			e.printStackTrace();
		}
	}

}
