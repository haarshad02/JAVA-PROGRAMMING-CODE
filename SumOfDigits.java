import java.util.Scanner;

class SumOfDigits 
{
	public static void main(String[] args) 
	{
		// Without while loop
		int num = 1234;
		int sum = 0;
		int rem = 0;

		rem = num%10;
		sum += rem;
		num = num/10;

		rem = num%10;
		sum += rem;
		num = num/10;

		rem = num%10;
		sum += rem;
		num = num/10;

		rem = num%10;
		sum += rem;
		num = num/10;

		// With while loop
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number between 0 to 1000 : ");
		int num = sc.nextInt();
		int add = 0;

		while (num > 0)
		{
			add += num % 10;
			num = num / 10;
		}

		System.out.println("The sum of the Digits is : " + add);
	}
}
