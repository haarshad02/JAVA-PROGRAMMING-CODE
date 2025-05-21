import java.util.Scanner;
class TipCalculation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Subtotal : ");
		float sub = sc.nextFloat();

		System.out.print("Enter the Gratuity Rate : ");
		float gra = sc.nextFloat();

		float graAmt = (gra/100) * sub;

		float total = sub + graAmt;

		System.out.println("The Gratuity is : " + graAmt);
		System.out.print("The Total Amount is : " + total);
	}
}