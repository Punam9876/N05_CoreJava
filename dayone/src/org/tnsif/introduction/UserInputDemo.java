//Program to demonstrate on user input

package org.tnsif.introduction;
import java.util.Scanner;
public class UserInputDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of num:");
		int num=s.nextInt();
		System.out.println("The value of Num is "+num);
		
		System.out.println("Enter the value of Floatnum:");
		float num1=s.nextFloat();
		System.out.println("The value of FloatNum is "+num1);
		
		System.out.println("Enter the value of Char:");
		char c=s.next().charAt(0);
		System.out.println("Character is "+c); 
		
		System.out.println("Enter the value of String:");
		String str1=s.nextLine();
		//s.next();
		System.out.println("String is "+str1);

	}

}
