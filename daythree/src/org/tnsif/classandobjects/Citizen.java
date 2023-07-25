//Program to demonstrate on Default and parameterize constructor 
package org.tnsif.classandobjects;
public class Citizen {
	//data member
	String citizenType;
	long aadharNo;
	String gender;
	String city;
	
	//default constructor
	Citizen()
	{
		System.out.println("Demonstration on default construction");
	}
	//Parameterized constructor

	public Citizen(String citizenType, long aadharNo, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.city = city;
		
	}

	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharNo=" + aadharNo + ", gender=" + gender + ", city="
				+ city + "]";
	}
	
	
	

}
