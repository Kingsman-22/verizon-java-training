import java.util.Scanner;

class Test
{
	public void show()
	{
		System.out.print("\nHello from Test");	
	}
}

class Test1 extends Test
{
	public void show()
	{
		super.show();
		System.out.print("\nHello from Test 1");
	}
}

class Solution
{
	public static void main (String args[])
	{
		Test t = new Test();
		t.show();
	}
}