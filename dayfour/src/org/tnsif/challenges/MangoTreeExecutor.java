/* Pratik so much interesting in gardening hence plants more tree in his garden.
 * He plant tree in rectangular fashion with order of rows and column and numbers the trees in 
 * row wise order. He planted the mango tree only in first row first column and last column.
 * So, you have given as tree number and row and column your task is find out whether given tree is 
 * mango tree or not
 * input n=5 
 * T=11(tree number)*/
package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor {
	static void isMangoTree(int n, int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
		{
			System.out.println("Mango Tree ");
		}
		else
		{
			System.out.println("Not a Mango Tree");
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the n and t value: ");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);
		s.close();
		

	}

}
