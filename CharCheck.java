import java.util.Scanner;

class  CharCheck
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = sc.next().charAt(0);

		System.out.println(((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))?
			((ch>='a' && ch<='z')?(ch + " is a Lowercase Alphabet"):(ch + " is a Uppercase Alphabet")):
			((ch>='0' && ch<='9')?(ch+ " is a Digit"):(ch + " is a Special Character")));
	}
}