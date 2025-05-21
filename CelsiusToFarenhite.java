import java.util.Scanner;

class  CelsiusToFarenhite
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Temperature in Celcius : ");
		double cel = sc.nextDouble();

		double far = (9.0/5) * cel + 32;
		System.out.println("Faranheit : " + far);
	}
}
