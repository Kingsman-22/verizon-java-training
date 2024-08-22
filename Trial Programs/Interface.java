import java.util.Scanner;

interface chaaya
{
	String drink = "TEA";
	void displayMethod();
}

interface kaapi
{
	String drink = "COFFEE";
}

class Solution implements chaaya,kaapi
{
	public void displayMethod()
	{
		System.out.print("\nCRISTIANO RONALDO IS THE GOAT!\n");	
	}
	public static void main (String args[])
	{
		Solution s = new Solution();
		s.displayMethod();
		System.out.print("My two favourite drinks are: "+chaaya.drink+" and "+kaapi.drink);
	}
}