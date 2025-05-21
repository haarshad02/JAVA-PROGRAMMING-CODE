import java.util.Scanner;

// Logics
// num % 2 == 0
// (num/2) * 2
// num/2 == num/2.0


class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		
		System.out.println(num%2 == 0);
		System.out.println((num/2)*2 == num);
		System.out.println(num/2 == num/2.0);
	}
}
