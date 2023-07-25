package org.insif.jumping;

import java.util.Scanner;

public class DigitInNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int n=0;
		do {
			num=num/10;
			n++;
			
		}while(num !=0);
		System.out.println("Number of digit are :"+n);
        s.close();
	}

}
