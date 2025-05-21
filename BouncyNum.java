import java.util.Scanner;
class BouncyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int dup = num;
		int pre = num%10;
		boolean inc = true;
		boolean dec = true;
		num/=10;

		for(int i=num; i>0; i/=10){
			int rem = i%10;
			if(pre < rem){
				inc = false;
				break;
			}
			pre = rem;
		}

		num = dup;
		num/=10;

		for(int i=num; i>0; i/=10){
			int rem = i%10;
			if(pre > rem){
				dec = false;
				break;
			}
			pre = rem;
		}

		if(inc == false && dec == false)
			System.out.println(dup+" is a Bouncy Number");
		else
			System.out.println(dup+" is not a Bouncy Number");
	}
}
