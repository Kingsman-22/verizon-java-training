class Person
{	
	private String name;
	private int age;
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void display()
	{
		System.out.print("\nName: "+name+". Age: "+age);
	}
}

class Solution
{
	public static void main (String args[])
	{
		Person p1 = new Person("Cristiano Ronaldo", 39);
		Person p2 = new Person("Sachin Tendulkar", 47);
		p2.display();
	}
}