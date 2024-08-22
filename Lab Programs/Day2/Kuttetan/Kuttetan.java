package Kuttetan;

import java.util.*;

public class Kuttetan
{
	Scanner sc = new Scanner(System.in);
	public void stringMethods()
	{
		String str = "Cristiano is the GOAT!";
		System.out.print("\nDEMONSTRATION OF STRING METHODS\n"+str);
		System.out.print("\nEnter the position of character to retrieve: ");
		int pos = sc.nextInt();
		if( pos < 0 || pos > str.length())
		{
			System.out.print("\nEntered position is out of bounds.");
		}
		else
		{
			System.out.print("\nCharacter at position "+pos+" is "+str.charAt(pos));
		}
		System.out.print("\n"+str.toUpperCase());
	}
	
	public void stringBufferMethods()
	{
		System.out.print("\nDEMONSTRATION OF STRING BUFFER METHODS\n\nEnter your String: ");
		StringBuffer sb = new StringBuffer(sc.next());
		System.out.print("Reverse of entered string is: "+sb.reverse());
		System.out.print("\nEnter a word to add at the end of the string: ");
		StringBuffer sb1 = new StringBuffer(sc.next());
		sb1 = sb1.insert(0, " ");
		StringBuffer sb2 = sb.append(sb1);
		System.out.print(sb2+"\n\nEnter the starting index to replace: ");
		int sp = sc.nextInt();
		System.out.print("\nEnter the ending index to replace: ");
		int ep = sc.nextInt();
		System.out.print("\nEnter the string that will take this position: ");
		String sb3 = sc.next();
		System.out.print("\n\nFinal string is: "+sb2.replace(sp,ep,sb3));
	}
}