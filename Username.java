import java.util.Scanner;

class  Username
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter thr Username : ");
		String un = sc.next().toUpperCase();
		for (int i=0; i<=un.length()-1 ;i++ )
		{
			System.out.print(un.charAt(i));
			Thread.sleep(2000);
		}
	}
}
