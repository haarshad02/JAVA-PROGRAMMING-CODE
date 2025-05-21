import java.util.Scanner;

class PrimeInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Starting Number : ");
		int st = sc.nextInt();
		System.out.print("Enter the Ending Number : ");
		int end = sc.nextInt();

		for(int i=st; i<=end; i++){
			boolean flag = true;
			for(int j=2; j<i; j++){
				if(i%j == 0){
					flag = false;
					break;
				}
			}
			if(flag){
					System.out.print(i+" ");
			}
		}
	}
}
