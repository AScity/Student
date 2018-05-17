package org.itstep;

public class StudentData {

	private String firstName;
	private String lastName;
	private int age;
	private String dateOfBirth;
	private String group;
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public StudentData(String firstName, String lastName, int age, String dateOfBirth, String group) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.group = group;
	}

	public StudentData(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	    }

	public StudentData() {
		super();
	}

	}
