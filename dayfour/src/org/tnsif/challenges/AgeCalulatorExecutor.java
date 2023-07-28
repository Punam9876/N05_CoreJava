/* Ask a user for their birth year encoded as 2 digit(like "62") and for current year ,also 
 * encoded as two digit(like "99"). Write a program to find user's current age in year*/
package org.tnsif.challenges;

import java.util.Scanner;

public class AgeCalulatorExecutor {
	
	static void AgeCalculator(int cy,int by)
	{
		if (cy>by) {
			System.out.println("Age is :"+(cy-by));
		}else {
			System.out.println("Age is: "+(100-by+cy));
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Current Year:");
		int cy=s.nextInt();
		System.out.println("Enter the Birth Year:");
		int by=s.nextInt();
		AgeCalculator(cy,by);
		s.close();
		
		
		
		
	}


}
