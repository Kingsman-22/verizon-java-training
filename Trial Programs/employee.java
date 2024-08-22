import java.util.Scanner;

class Employee
{
	public int empId = 30401;
	private String empName = "John Doe";
}
class Student
{
	public int studentrollNO =456;
	private String studentname="varshA";
}

class Solution
{
	public static void main (String args[])
	{
		Employee e = new Employee();
		System.out.print("Employee ID: "+ e.empId);
		Student s=new Student();
		System.out.print("Student rollNO: "+ s.studentrollNO);
	}
}