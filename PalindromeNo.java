import java.util.Scanner;
class PalindromeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dup = num;

		if(num < 0){
			System.out.println("Not a Palindrome Number");		
			return;
		}

		int rev = 0;

		while(dup > 0){
			rev = rev*10 + (dup%10);
			dup /= 10;
		}

		if(rev == num){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not a Palindrome Number");			
		}
	}
}
