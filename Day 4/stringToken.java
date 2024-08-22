import java.util.*;

class Solution
{
	public static void main (String args[])
	{
		StringTokenizer st = new StringTokenizer("Cristiano Ronaldo is the best player ever!");
		int count = st.countTokens();
		System.out.print("\nNumber of tokens = "+count+"\n");
		while(st.hasMoreTokens())
		{	
			System.out.print(st.nextToken());
		}
	}
}