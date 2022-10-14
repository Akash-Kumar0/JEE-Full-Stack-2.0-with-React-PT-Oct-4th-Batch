package lab_1;

import java.util.*;

public class L1_ex_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String ch=sc.nextLine();
		switch(ch) {
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
			System.out.println("ready");
			break;
		case "green":
			System.out.println("go");
			break;
		default:
			System.out.println("Wrong choice, try again!");
		}
	}

}
