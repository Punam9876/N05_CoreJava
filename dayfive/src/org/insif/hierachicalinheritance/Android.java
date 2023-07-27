package org.insif.hierachicalinheritance;
//base class
public class Android {
	
	private String brandName;
	private String SlotType;
	
	//getters and setters
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getSlotType() {
		return SlotType;
	}
	public void setSlotType(String slotType) {
		SlotType = slotType;
	}
	@Override
	public String toString() {
		return "Android [brandName=" + brandName + ", SlotType=" + SlotType + "]";
	}
	public Android() {
		System.out.println("Android Default Constructor");
	}
	
	//parameterized constructor
	public Android(String brandName, String slotType) {
		super();
		this.brandName = brandName;
		SlotType = slotType;
	}
	
	
	
	
	

}
