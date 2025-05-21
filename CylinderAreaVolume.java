import java.util.Scanner;

class  CylinderAreaVolume
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		float radius = sc.nextFloat();
		System.out.println("Enter the Length : ");
		float length = sc.nextFloat();

		final float pi = (22.0f/7.0f);

		float area = 3.14f * radius * radius;
		float volume = area * length;

		System.out.println("Area : " + area);
		System.out.println("Volume : " + volume);
	}
}
