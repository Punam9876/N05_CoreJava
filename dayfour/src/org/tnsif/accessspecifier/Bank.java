//program to demonstrate on access specifier
package org.tnsif.accessspecifier;
public class Bank {
	
	//different access specifier
	public String bankName;
	private int pinNo;
	long accountNo=34567892556L;
	
	//public method
	public void displayPublic()
	{
		System.out.println("Bank Name is: "+bankName);
	}
	
	//private method
	private void displayprivate()
	{
		System.out.println("Pin No. is: "+pinNo);
	}
	
	//default method
	void displayDefault()
	{
		System.out.println("Account No is: "+accountNo);
	}
	
	

}
