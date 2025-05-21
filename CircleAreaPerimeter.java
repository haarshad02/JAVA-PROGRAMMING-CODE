import java.util.Scanner;

class CircleAreaPerimeter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of the Radius : ");
		float r = sc.nextFloat();

		final float pi = (22/7);

		float area = pi * r * r;
		float perimeter = 2 * pi * r;
		System.out.println("The Area of the Circle is : "+area+" sqcm");
		System.out.println("The Perimeter of the Circle is : "+perimeter+" cm");
	}
}
