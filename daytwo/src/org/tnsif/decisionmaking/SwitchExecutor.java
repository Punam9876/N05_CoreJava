//program to demonstrate switch statement
package org.tnsif.decisionmaking;
import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String songno=s.next();
		switch(songno)
		{
		    case "First":
		    	System.out.println("Perfect");
		    	break;
		    case "Second":
		    	System.out.println("Oo Antava");
		    	break;
		    case "Third":
		    	System.out.println("Taki");
		    	break;
		    default:
		    	System.out.println("Invalid Input");
		    
		    	
		}
		s.close();
				

	}

}
