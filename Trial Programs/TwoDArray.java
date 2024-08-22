import java.util.Scanner;
class Solution
{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter row value: ");
		int row = s.nextInt();
		System.out.print("Enter column value: ");
		int column = s.nextInt();
		int arr[][] = new int[row][column];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				arr[i][j] = i+j;
			}
		}
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				System.out.print(i+j + "\t");
			}
			System.out.print("\n");
		}
	}
}