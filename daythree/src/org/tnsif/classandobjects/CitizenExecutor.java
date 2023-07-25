//Driver class
//Program to demonstrate on Default and parameterize constructor 
package org.tnsif.classandobjects;

public class CitizenExecutor {

	public static void main(String[] args) {
		Citizen c= new Citizen();
		Citizen c1=new Citizen("adult",123456789987L,"Female","Nagpur");
		System.out.println(c1);

	}

}
