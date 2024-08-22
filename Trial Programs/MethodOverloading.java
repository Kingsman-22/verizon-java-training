import java.util.Scanner;

class Maths
{
	Scanner sc = new Scanner(System.in);
	public void add()
	{
		int sum = 0;
		int n = 0;
		char ch = 'y';
		while(ch == 'y' || ch == 'Y')
		{
			System.out.print("\nEnter your number: ");
			n = sc.nextInt();
			sum += n;
			System.out.print("\nAdd more numbers?(y/n): ");
			ch = sc.next().charAt(0);
		}
		System.out.print("\nFinal sum = "+sum);
	}
	public void add(int a,int b)
	{
		System.out.print("\nSum of two numbers = "+(a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.print("\nSum of two numbers = "+(a+b+c));
	}
}

class Solution
{
	public static void main (String args[])
	{
		Maths m = new Maths();
		Scanner sc = new Scanner(System.in);
		System.out.print("\tADDITION MENU\n1. Add 2 numbers\n2. Add 3 numbers\n3. Add more than 3 numbers\nEnter your choice: ");
		int addChoice = sc.nextInt();
		if(addChoice == 1)
		{
			System.out.print("\nEnter your first number: ");
			int a = sc.nextInt();
			System.out.print("\nEnter your second number: ");
			int b = sc.nextInt();
			m.add(a,b);
		}
		else if(addChoice == 2)
		{
			System.out.print("\nEnter your first number: ");
			int a = sc.nextInt();
			System.out.print("\nEnter your second number: ");
			int b = sc.nextInt();
			System.out.print("\nEnter your third number: ");
			int c = sc.nextInt();
			m.add(a,b,c);
		}
		else if(addChoice == 3)
		{
			m.add();
		}
		else
		{
			System.out.print("\nWrong choice.");
		}
	}
}