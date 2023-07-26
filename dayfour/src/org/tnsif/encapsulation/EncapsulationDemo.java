//Driver class
//Program to demonstrate on encapsulation 
package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		
		//setting a value for private members
		h.setAccountNo(234567197653227L);
		h.setAccountType("Current Account");
		h.setCvvNo(2334);
		h.setPinNo(1221);
		
		/*//accessing and printing all private members
		System.out.println("Account No: "+h.getAccountNo());
		System.out.println("Account Type: "+h.getAccountType());
		System.out.println("CVV No: "+h.getCvvNo());
		System.out.println("Pin NO:"+h.getPinNo());
        */
		System.out.println(h);
	}

}
