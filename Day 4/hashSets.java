import java.util.*;

class Solution
{
	public static void main (String args[])
	{
		HashSet<String> players = new HashSet<String>();
		players.add("Cristiano");
		players.add("Messi");
		players.add("Sunil Chetri");
		players.add("Kevin De Bruyne");
		for(String i:players)
		{
			System.out.print("\n\t"+i.toUpperCase());
		}
	}
}