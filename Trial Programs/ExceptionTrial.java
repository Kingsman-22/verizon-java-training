import java.util.Scanner;
import java.io.*;

class Solution
{
	public static void main(String args[]) 
	{
		try
		{
			System.out.print(10/0);
		}
		catch(Exception e)
		{
			System.out.print("Division by zero is not possible");
		}	
	}
}