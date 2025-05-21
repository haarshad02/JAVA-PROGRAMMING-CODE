import java.util.Scanner;

class PoundsToKg
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Weight in Pounds(lbs) : ");

		float lbs = sc.nextFloat();

		float kg = 0.454f * lbs;

		System.out.println(lbs + " Pounds equals to " + kg + " Kilograms");
	}
}
