import java.util.Scanner;
class RevStr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String rev = "";

		for(int i=0; i<=str.length()-1; i++){
			rev = str.charAt(i) + rev;
		}

		System.out.println("Reverse String : "+ rev);
	}
}
