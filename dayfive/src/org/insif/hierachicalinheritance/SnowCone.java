package org.insif.hierachicalinheritance;
//child class
public class SnowCone extends Android {
	
	//private data member
	private int version;

	
	//getters setters
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}

	//parameterized constructor
	public SnowCone(String brandName, String slotType,int version) {
		super(brandName, slotType);
		this.version=version;
	}
	
	
	

}
