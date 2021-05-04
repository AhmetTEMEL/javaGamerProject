package entities;

import abstracts.Entities;

public class Gamer implements Entities{
	
	private int id;
	private String gamerId;
	private String firstName;
	private String lastName;
	private String TcNo;
	private String yearOfBirthdate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getTcNo() {
		return TcNo;
	}
	public void setTcNo(String tcNo) {
		TcNo = tcNo;
	}
	public String getYearOfBirthdate() {
		return yearOfBirthdate;
	}
	public void setYearOfBirthdate(String yearOfBirthdate) {
		this.yearOfBirthdate = yearOfBirthdate;
	}
	public String getGamerId() {
		return gamerId;
	}
	public void setGamerId(String gamerId) {
		this.gamerId = gamerId;
	}

}
