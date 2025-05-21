import java.util.Scanner;

class NeonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int sqr = num*num;

		int sum = 0;

		while(sqr > 0){
			int rem = sqr%10;
			sum += rem;
			sqr /= 10;
		}

		if(sum == num)
			System.out.println(num+" is a Neon Number");
		else
			System.out.println(num+" is not a Neon Number");
	}
}
