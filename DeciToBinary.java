import java.util.Scanner;
class DeciToBinary 
{
	public static void main(String[] args) 
	{
		// By using Loop
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		String bin = "";

		for (int i=num; i>0 ; i/=2)
		{
			bin = (i%2)+bin;
		}

		System.out.println(num+" : "+bin);


		// Without using Loop
		String binary = Integer.toBinaryString(num);
		System.out.println(num+" : "+binary);
	}
}
