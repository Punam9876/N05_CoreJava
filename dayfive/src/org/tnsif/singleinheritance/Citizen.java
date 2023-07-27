package org.tnsif.singleinheritance;
//Base class
public class Citizen {
	
	private String city;
	private int pincode;
	private long aadharNo;
	private long contactNo;
	
	
	
	//Default constructor
	public Citizen() {
		System.out.println("Default Constructor");
	}
	
	
	//parameterized constructor
	public Citizen(String city, int pincode, long aadharNo, long contactNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.aadharNo = aadharNo;
		this.contactNo = contactNo;
		System.out.println("Parameterized Constructor");
	}
	
	
	//getters and setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", aadharNo=" + aadharNo + ", contactNo=" + contactNo
				+ "]";
	}
	
	
	
	
	
	

}
