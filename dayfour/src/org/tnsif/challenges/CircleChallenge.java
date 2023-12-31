/*Their are n people standing in circle waiting to be executed. The counting out begins
 at some point 
 * in circle and proceed around circle in fixed direction. In each step a certain no. of people are skip and next person 
 * is executed. the elimination processed  around circle (which is becoming smaller and smaller 
 * as executed people are removing), until only last person remain who is given predom.
 * given the total no. of person and a no. k which indicate that k-1 person are skipped  and the 
 * k person is killed in circle. The task is choose person in initial circle that survive*/
package org.tnsif.challenges;

import java.util.Scanner;

public class CircleChallenge {
	static int survive(int n,int k)
	{
		if(n==1)
			return 1;
		else
			return (survive(n-1,k)+k-1)%n+1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));
		s.close();
		
	}

}
