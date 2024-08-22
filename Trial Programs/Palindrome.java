import java.util.Scanner;

class Solution
{
	public static void main(String args[]) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String: ");
		StringBuffer sb = new StringBuffer(sc.next());
		StringBuffer sbrev = new StringBuffer(sb.reverse());
		System.out.print("\n"+sb+" "+sbrev);
		if(sb == sbrev)
		{
			System.out.print("\n"+sb+" is palindrome.");
		}
		else
		{
			System.out.print("\n"+sb+" is not palindrome.");
		}	
	}
}