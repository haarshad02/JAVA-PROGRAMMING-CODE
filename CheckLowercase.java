import java.util.Scanner;

class  CheckLowercase
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = sc.next().charAt(0);

		System.out.println((ch>='a' && ch<='z')?("Lowercase Character"):("Not a Lowercase Character"));
	}
}
