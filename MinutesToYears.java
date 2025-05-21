import java.util.Scanner;

class MinutesToYears 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Minutes : ");
		double min = sc.nextDouble();

		double years = min / (365*24*60);
		double days = (min % (365*24*60)) / (24*60);

		System.out.println("Years : " + years + " and" + days + " days");
	}
}




