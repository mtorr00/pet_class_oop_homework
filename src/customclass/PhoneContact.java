package customclass;

public class PhoneContact {
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String phoneType;
	
	
	
	public PhoneContact() {
		this.setFirstName("Todd");
		this.setLastName("Moussallem");
		this.setPhoneNum("5504489332");
		this.setPhoneType("Home Phone");
	}
	public PhoneContact(String lastName, String phoneNum) {
		this.setLastName(lastName);
		this.setPhoneNum(phoneNum);
	}
	public PhoneContact(String firstName, String lastName, String phoneNum, String phoneType) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNum(phoneNum);
		this.setPhoneType(phoneType);
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	
	
	public boolean isTodd() {
		if(this.firstName == "Todd") {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public String getFullInfo() {
		return "Contact Name: " + this.firstName + " " + this.lastName + "\nPhone Number: " + this.phoneNum + "\nPhone Type: " + this.phoneType;
	}
}
