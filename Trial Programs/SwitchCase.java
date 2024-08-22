import java.util.Scanner;

class Solution
{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = s.nextInt();
		if(number == 6 || number == 7 ||number == 8 ||number == 9)
		{
			System.out.print("Rainy season");
		}
		else if(number == 10 || number == 11 ||number == 12 ||number == 1)
		{
			System.out.print("Winter season");
		}
		else if(number == 2 || number == 3 ||number == 4 ||number == 5)
		{
			System.out.print("Summer season");
		}
		else
		{
			System.out.print("Not a season");
		}
	}
}