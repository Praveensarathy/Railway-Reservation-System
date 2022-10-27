package model;

import java.util.ArrayList;

public class Bookings {
	static public int id =1;
	private String Name;
	private int age,bookingId=id++;
	private char preferedBirth;
	
	public char getPreferedBirth() {
		return preferedBirth;
	}
	public void setPreferedBirth(char preferedBirth) {
		this.preferedBirth = preferedBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

}
