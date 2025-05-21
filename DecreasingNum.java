import java.util.Scanner;
class DecreasingNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int dup = num;
		int pre = num%10;
		boolean flag = true;
		num/=10;

		for(int i=num; i>0; i/=10){
			int rem = i%10;
			if(pre > rem){
				flag = false;
				break;
			}
			pre = rem;
		}

		if(flag)
			System.out.println(dup+" is a Decreasing Number");
		else
			System.out.println(dup+" is not a Decreasing Number");

	}
}
