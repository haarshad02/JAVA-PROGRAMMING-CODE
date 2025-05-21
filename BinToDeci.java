import java.util.Scanner;
class BinToDeci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Binary Number : ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;
		int pow =1;

		for (int i=num; i>0 ; i/=10)
		{
			int rem = i%10;
			
			if(rem == 1)
			{
				sum += pow;
			}
			pow *= 2;
			
		}
		//pow++;
			
		System.out.println(dup+" : "+sum);

	}
}
