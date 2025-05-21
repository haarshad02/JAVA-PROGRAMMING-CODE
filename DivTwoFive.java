import java.util.Scanner;

class DivTwoFive 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println((num%2==0 || num%5==0)?
			((num%2==0 && num%5==0)?("Hi Two Hi Five"):((num%5 != 0)?("Hi Two"):("High Five"))):
			(""));
	}
}
