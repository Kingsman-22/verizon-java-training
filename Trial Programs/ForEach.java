import java.util.Scanner;

class Solution
{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
		{
			System.out.print("\nEnter the value at position "+i+": ");
			arr[i] = s.nextInt();
		}
		System.out.print("\nArray contents are: ");
		for(int j:arr)
		{
			System.out.print("\t"+j);
		}
	}
}