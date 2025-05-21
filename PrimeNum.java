import java.util.Scanner;

class PrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// By not using Loops
		System.out.println((num==2||num==3||num==5)?(num+" is Prime"):
			((num%2==0||num%3==0||num%5==0)?(num+" is not Prime"):(num+" is Prime")));
	}
}
