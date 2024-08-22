import Cristiano.*;
import Constructor.*;
import Parent.*;

class Child extends Parent
{
	public Child()
	{
		System.out.print("\nHello from child");
	}		
}

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Child c = new Child();
	}
}