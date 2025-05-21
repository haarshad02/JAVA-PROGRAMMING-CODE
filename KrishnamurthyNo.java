import java.util.Scanner;
class KrishnamurthyNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();

		int dup = num;
		int sum = 0;

		while(dup > 0){
			int rem = dup%10;
			int fact = 1;
			

			for(int i=1; i<=rem; i++){
				fact *= i;
			}

			sum += fact;
			fact =1;
			dup /= 10;
		}

		System.out.println(sum == num ? "Krishnamurthy Num" : "Not a Krishnamurthy Num");
	}
}
