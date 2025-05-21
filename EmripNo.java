import java.util.Scanner;
class EmripNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		boolean flag = true;
		int rev = 0;

		for (int i=2; i<num ; i++ ){
			if(num%i == 0){
				flag = false;
				break;
			}
		}
		if(flag){
			while(num>0){
				rev = (rev*10) + (num%10);
				num /= 10;
			}

			boolean fg = true;
			for (int i=2; i<rev ; i++ ){
				if(rev%i == 0){
					fg = false;
					break;
				}
			}

			if(fg){
				System.out.println("Emrip Number");
			}
			else{
				System.out.println("Not a Emrip Number");
			}
		}
		else{
			System.out.println("Not a Emrip Number");
		}

		


	}
}
