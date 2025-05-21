import java.util.Scanner;

class MulTable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		System.out.print("Enter the Range : ");
		int range = sc.nextInt();

		for (int i=1; i<=range; i++ )
		{
			System.out.println(i+"X"+num+"="+(num*i));
		}
	}
}
