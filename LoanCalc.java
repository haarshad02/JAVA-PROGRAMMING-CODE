import java.util.Scanner;

class LoanCalc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("************ LOAN CALCULATOR *************");
		System.out.println();
		System.out.print("Enter the Amount : ");
		float amt = sc.nextFloat();
		System.out.print("Enter the ROI : ");
		float roi = sc.nextFloat();
		System.out.print("Enter the Tenure (months) : ");
		int month = sc.nextInt();

		String str = (month/12)+"."+(month%12);
		float con = Float.parseFloat(str);

		System.out.println();
		System.out.println("Principal Amount : "+amt);
		System.out.println("ROI : "+roi+"%");
		System.out.println("Tenure : "+month+" months");
		float intYear = amt*roi/100;
		float totIntrest = intYear*con;
		System.out.println("Intrest :"+totIntrest);
		float outstanding = amt+totIntrest;
		System.out.println("Total Outstanding Amount : "+outstanding);
		System.out.println("EMI :"+outstanding/month+" rs");
	}
}
