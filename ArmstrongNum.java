import java.util.Scanner;
class  ArmstrongNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");

		int num = sc.nextInt();

		int dup = num, len = 0, sum = 0;

		for (int i=num; i>0 ; i/=10 )
			len++;

		while(num>0){
			int rem = num%10;
			int pow = 1;
			for(int i=1; i<=len; i++)
				pow*=rem;
			sum+=pow;
			num/=10;
		}

		System.out.println(dup==sum ? dup+" is a Armstrong Number" : dup+" is not a Armstrong Number");
	}
}
