import java.util.Scanner;

class DuckNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String num = sc.next();

		if (num.charAt(0) == '0') {
			System.out.println(num+" is not a Duck Number");
            return;
        }
        
        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
				System.out.println(num+" is a Duck Number");
                return;
            }
        }
		System.out.println(num+" is not a Duck Number");
	}
}
