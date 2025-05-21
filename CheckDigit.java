import java.util.Scanner;

class  CheckDigit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char digit = sc.next().charAt(0);

		System.out.println((digit>='0' && digit<='9')?(digit + " is a Digit"):(digit + " not a Digit"));
	}
}
