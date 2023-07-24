//Program to demonstrate on if else statement
package org.tnsif.decisionmaking;
import java.util.Scanner;
public class ifelseexecutor {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Age of person: ");
		int Age=s.nextInt();
		System.out.println("Enter Weight of person: ");
		int Weight=s.nextInt();
		if ((Age>=18)&& (Weight>=50))
			System.out.println("Person is eligible for Blood Donation");
		else
			System.out.println("Person is Not eligible for Blood Donation");
		s.close();

	}

}
