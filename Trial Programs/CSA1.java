import java.util.Scanner;

class Bank
{
	float balance = 10000;
	void debit(float amount)
	{	
		if(balance <= 5000 || amount >= balance || (balance-amount) <= 5000)
		{
			System.out.print("\nYou dont have sufficient balance.\n");	
		}
		else
		{
			balance -= amount;
			System.out.print("\nAmount of "+amount+" was withdrawn. Balance amount = "+balance);
		}
	}
	void credit(float amount)
	{
		balance += amount;
		System.out.print("\nAmount "+amount+" is credited to your account. Current balance = "+balance);
	}
}

class Solution
{
	public static void main (String args[])
	{
		char ch = 'y';
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("\t *** BANKING SYSTEM *** ");
			System.out.print("\n1. View Balance\n2. Debit amount\n3. Credit amount\nEnter your choice: ");
			char choice = sc.next().charAt(0);
			if(choice == '1')
			{
				System.out.print("\nBalance = "+b.balance+"\n\n");
			}
			else if(choice == '2')
			{
				System.out.print("\nEnter the amount to be debited: ");
				float a = sc.nextFloat();
				b.debit(a);
			}
			else if(choice == '3')
			{
				System.out.print("\nEnter the amount to be credited: ");
				float a = sc.nextFloat();
				b.credit(a);
			}
			else
			{
				System.out.print("\nWrong input.");
			}
			System.out.print("\nPerform more operations? (y/n): ");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}