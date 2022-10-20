package lab5;

import java.util.*;

public class l5_ex_1 {

	public static void main(String[] args) throws AgeException, NameException, 
	EmployeeException {
		
		//exercise 1
		
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
		
		//exercise 2
		
		String first_name="ram";
		String second_name=null;
		try {
			if(first_name==null || second_name==null) {
				throw new NameException("First Name or Last Name should not be null");
			}
		}
		catch(NameException e) {
			e.printStackTrace();
		}
		
		//exercise 3
		
		int salary=sc.nextInt();
		try {
			if(salary<3000) {
				throw new EmployeeException("Salary is below 3000");
			}
		}
		catch(EmployeeException e) {
			e.printStackTrace();
		}
	}

}
