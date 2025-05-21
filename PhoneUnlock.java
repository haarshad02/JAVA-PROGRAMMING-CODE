import java.util.Scanner;

class PhoneUnlock 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int storedPin = 143;
		int seconds = 5000;

		outerLoop:
		for (; ; )
		{
			int attempts = 3;
			do
			{
				System.out.print("Enter the Password : ");
				int pass = sc.nextInt();

				if(storedPin == pass){
					System.out.println("Phone Unlocked");
					break outerLoop;
				}
				else{
					System.out.println("Wrong Pin");
					System.out.println("Attempt Left : "+(attempts-1));
				}
				attempts--;
			}
			while (attempts > 0);
			
			System.out.println();
			System.out.println("Phone is locked for "+(seconds/1000)+ " seconds");
			Thread.sleep(seconds);
			seconds *= 2;
			System.out.println();
		}
	}
}
