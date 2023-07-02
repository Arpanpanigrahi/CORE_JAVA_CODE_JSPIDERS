package com.jsp.inheritancepack2;

class Human
{
	String name;
	int age;
	String gender;
	
	Human(String name, int age, String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}

class Doctor extends Human
{
	String specialist;
	
	Doctor(String name, int age, String gender, String specialist)
	{
		super(name,age,gender);
		this.specialist = specialist;
	}
	
	public void displayDoctorDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Specialist: "+specialist);
	}
}
public class JobApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d1 = new Doctor("DAVID",46,"MALE","CARDIO");
		d1.displayDoctorDetails();
	}

}
