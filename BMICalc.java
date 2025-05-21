import java.util.Scanner;

class BMICalc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your weight in Pounds : ");
		float weight = sc.nextFloat();
		System.out.print("Enter your height in inches : ");
		float height = sc.nextFloat();

		float kgWeight = weight*0.45358237f;
		float meterHeight = height*0.0254f;

		float bmi = kgWeight/(meterHeight * meterHeight);

		System.out.println("BMI : "+bmi);
	}
}
