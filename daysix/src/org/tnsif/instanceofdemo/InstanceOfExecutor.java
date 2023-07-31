//program to demonstrate on instanceof operator
package org.tnsif.instanceofdemo;
//parent class
class Flower
{
	String name="Rose";
}
//child class
class Rose extends Flower
{
	String color="Red";
}
public class InstanceOfExecutor {

	public static void main(String[] args) {
		Rose r=new Rose();
		System.out.println(r instanceof Flower);
	}

}
