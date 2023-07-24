//Program to demonstrate on bunjee jumping using  nested if statement
package org.tnsif.decisionmaking;
import java.util.Scanner;
public class NestedIfExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Age of Person:");
		int Age=s.nextInt();
		System.out.println("Enter the Weight of Person:");
		float Weight=s.nextFloat();
		
		if(Age>=12)
		{
			if(Weight>=40)
			{
				System.out.println("Person is eligible for bunjee jumping");
				if(Weight>110)
				{
					System.out.println("Extra rope will be added");
				}
			}
			else
			{
				System.out.println("Person is not eligible for bunjee jumping");
			}
		}
		else
		{
			System.out.println("Person is not eligible for bunjee jumping");
		}
        s.close();
	}

}
