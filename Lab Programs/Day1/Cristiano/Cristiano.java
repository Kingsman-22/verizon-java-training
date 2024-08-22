package Cristiano;

import java.util.*;

public class Cristiano
{
	public Scanner sc = new Scanner(System.in);

	public void ternaryOperator()
	{
		System.out.print("PROGRAM TO DEMONSTRATE TERNARY OPERATOR\n\nCHECKING IF ENTERED NUMBER IS ODD OR EVEN\n\nEnter your number: ");
		int number = sc.nextInt();
		String result = (number%2==0) ? "\nEntered number is even." : "\nEntered number is odd.";
		System.out.print(result);
	}

	public void checkAgeAbove18()
	{
		System.out.print("PROGRAM TO CHECK IS PERSON IS ELIGIBLE TO VOTE\n\nEnter your age: ");
		int number = sc.nextInt();
		String result = (number >= 18) ? "\nYou are eligible to vote." : "\nYou are not eligible to vote.";
		System.out.print(result);
	}

	public void displayTenToOne()
	{
		System.out.print("PROGRAM TO DISPLAY FROM 10 TO 1\n\n");
		int n = 10;
		while(n > 0)
		{
			System.out.print("\t"+n);
			n--;
		}
	}

	public void multiplicationTable()
	{
		System.out.print("PROGRAM TO DISPLAY MULTIPLICATION TABLE");
		System.out.print("\n\nEnter the number of which you want the multiplication table: ");
		int number = sc.nextInt();
		for(int i=2; i<6; i++)
		{
			for(int j=1; j<(number+1); j++)
			{
				System.out.print(i+" * "+j+" = "+(i*j)+"\n");
			}
			System.out.print("\n");
		}
	}

	public void forLoopReplacement()
	{
		System.out.print("PROGRAM TO DEMONSTRATE FOR EACH LOOP\n");
		int a[] = {7,11,17,25};
		for(int i:a)
		{
			System.out.print(i+"\t");
		}
	}

	public void reverseOfANumber()
	{
		System.out.print("PROGRAM TO REVERSE A NUMBER\n\nEnter your number: ");
		StringBuffer sb = new StringBuffer(sc.next());
		System.out.print("\nThe reverse of your number is: "+sb.reverse());
	}

	public void display3By3Array()
	{
		System.out.print("PROGRAM TO DISPLAY A 3 BY 3 MATRIX");
		int a[][] = new int[3][3];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				a[i][j] = i+j;
			}
		}
		System.out.print("\nA sample 3 by 3 array would be: \n");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
	
	public void digitalClock() throws Exception
	{
		for(int i=0; i<25; i++)
		{
			for(int j=0; j<60; j++)
			{
				for(int k=0; k<60; k++)
				{
					String hours = (i>9) ? Integer.toString(i) : "0"+Integer.toString(i);
					String mins = (j>9) ? Integer.toString(j) : "0"+Integer.toString(j);
					String seconds = (k>9) ? Integer.toString(k) : "0"+Integer.toString(k);
					System.out.print(hours+":"+mins+":"+seconds+"\r");
					Thread.sleep(1000);
				}
			}
		}
	}

	public static void staticMethod()
	{
		System.out.print("Hello from Static Method\n");
	}

	public void normalMethod()
	{
		System.out.print("Hello from Normal Method\n");
	}

}