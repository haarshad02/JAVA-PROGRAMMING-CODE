import java.util.Scanner;

class SunnyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();

		int sqrt = (int) Math.sqrt(num+1);

		if(sqrt*sqrt == (num+1))
			System.out.println(num+" is a Sunny Number");
		else
			System.out.println(num+" is not a Sunny Number");
	}
}
