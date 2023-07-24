package org.tnsif.introduction;
import java.util.Scanner;
public class ExampleBloodDonation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Age of Person:");
		int Age=s.nextInt();
		System.out.println("Enter the Weight of Person:");
		float Weight=s.nextFloat();
		
		if ((Age>=18)&& (Weight>=50))
			System.out.println("Person is eligible for Blood Donation");
		else
			System.out.println("Person is Not eligible for Blood Donation");
		s.close();
		
				

	}

}
