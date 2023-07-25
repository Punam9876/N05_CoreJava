//Driver Class
//Program to demonstrate on class and object
package org.tnsif.classandobjects;

public class SandwichExecutor {

	public static void main(String[] args) {
		//object creation
		Sandwich s=new Sandwich();
		//method call
		s.breadType="Brown bread";
		s.noOfSlice=4;
		s.display();
	}

}
