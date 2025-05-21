import java.util.Scanner;
class AutomorphicNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();

		int len = 0;
		int div = 1;

		for(int i=num; i>0; i/=10)
			len++;

		for (int i=1;i<=len ; i++)
			div *= 10;

		if((num*num)%div == num)
			System.out.println(num+" is a Automorphic Number");
		else
			System.out.println(num+" is not a Automorphic Number");

	}
}
