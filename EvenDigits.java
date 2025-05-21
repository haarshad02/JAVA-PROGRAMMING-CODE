import java.util.Scanner;
class EvenDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int rem = 0;
		int sum = 0;

		while(num > 0){
			rem = num%10;
			if(rem%2 == 0){
				sum = sum + rem;
			}
			num = num/10;
		}

		System.out.println(sum);
	}
}
