import java.util.Scanner;

class Solution
{
	public static void main(String args[]) 
	{
		String s1 = "Mumbai ";
		String s2 = "Indians";
		System.out.println(s1.concat(s2));
		System.out.println((s1.concat(s2)).toUpperCase());
		System.out.println((s1.concat(s2)).toUpperCase().replace('A', 'Y'));	
	}
}