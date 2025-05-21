import java.util.Scanner;
class PalindromeStr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String dup = str;

		String rev = "";

		for(int i=0; i<=str.length()-1; i++){
			rev = str.charAt(i) + rev;
		}

		if(dup.equals(rev)){		
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a Palindrome String");
		}

	}
}
