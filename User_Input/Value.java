package User_Input;

import java.util.Scanner;

public class Value {

	public static void main(String[] args) {
	
		Scanner s1=new Scanner(System.in);
		System.out.println("write first name");
		String first_name=s1.next();
		System.out.println("write last name");
		String last_name=s1.next();
		System.out.println("write Email");
		String Email=s1.next();
		System.out.println("write Password");
		String Password=s1.next();
		System.out.println("Select Gender");
		String Gender=s1.next();
		System.out.println("Provide Present Address");
		String Present_Address=s1.next();
		System.out.println("Provide Permanent Address");
		String Permanent_Address=s1.next();
		System.out.println("Write pincode");
		int Pincoded=s1.nextInt();
		

	}

}
