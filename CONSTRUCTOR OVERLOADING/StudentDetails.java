class Student
{
	int id;
	String name;
	int age;
	String phno;
	static String collegeName;
	static String collegeAddress;
	
	Student(int id, String name, int age, String phno) //param const.
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.phno = phno;
	}
	
	public void displayStudentDetails() //non static method
	{
		System.out.println("Student ID:"+this.id);
		System.out.println("Student Name:"+this.name);
		System.out.println("Student Age:"+this.age);
		System.out.println("Student Contact:"+this.phno);
		System.out.println("Student College Name:"+this.collegeName);
		System.out.println("Student College Address:"+this.collegeAddress);
		System.out.println("****************************************************");
		System.out.print("\n");
	}
	
	public static void changeCollegeName(String collegeName)
	{
		Student.collegeName = collegeName;
	}
	
	public static void changeCollegeAddress(String collegeAddress)
	{
		Student.collegeAddress = collegeAddress;
	}
}
	
class StudentDetails
{
	public static void main(String[] args)
	{
		Student.collegeName = "JSP";
		Student.collegeAddress = "OAR";
			
		Student s1 = new Student(1,"Jitin",24,"1234567890");
		s1.displayStudentDetails();
			
		Student s2 = new Student(2,"Mary",23,"0987654321");
		s2.displayStudentDetails();
			
		Student.changeCollegeName("JSpiders");
		Student.changeCollegeAddress("Marathalli");
			
		s1.displayStudentDetails();
		s2.displayStudentDetails();
	}
}
			
			
	
		