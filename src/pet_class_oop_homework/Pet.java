package pet_class_oop_homework;

public class Pet {
	
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setLocation(String locale) {
		this.location = locale;
	}
	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}
	public int getAge() {
		return this.age;
	}
	
	
	public Pet() {
		this.name = "Paul";
		this.age = 4;
		this.location = "San Francisco";
		this.type = "Dog";
	}
	public Pet(String name,int age,String location,String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
}
