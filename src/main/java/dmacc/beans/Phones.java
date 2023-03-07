package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Phones {
	//Private Variables
	@Id
	@GeneratedValue
	private long id;
	private String Manufacturer;
	private String OS;
	private String phoneModel;
	
	
	//Default no arg
	public Phones() {
		super();
		this.Manufacturer = "";
		this.OS = "";
		this.phoneModel = "";
	}
	
	//Phones Constructor
	public Phones(String manufacturer, String oS, String phoneModel) {
		super();
		this.Manufacturer = manufacturer;
		this.OS = oS;
		this.phoneModel = phoneModel;
	}
	
	//Getters and Setters
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
	public String getPhoneModel() {
		return phoneModel;
	}
	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Phones [Manufacturer=" + Manufacturer + ", OS=" + OS + ", phoneModel=" + phoneModel + "]";
	}
	
	
	
	
}
