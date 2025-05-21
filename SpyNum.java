import java.util.Scanner;

class SpyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		int pro = 1;

		while(dup > 0){
			int rem = dup%10;
			sum += rem;
			pro *= rem;
			dup /= 10;
		}

		if(sum == pro)
			System.out.println(num+" is a Spy Number");
		else
			System.out.println(num+" is not a Spy Number");
	}
}
