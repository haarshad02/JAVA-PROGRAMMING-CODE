import java.util.Scanner;

class  CheckUppercase
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = sc.next().charAt(0);

		System.out.println((ch>='A' && ch<='Z')?("Uppercase Character"):("Not a Uppercase Character"));
	}
}
