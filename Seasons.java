import java.util.Scanner;

class Seasons 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Month : ");
		String month = sc.next().toUpperCase();

		String op = (month.equals("OCT")) || (month.equals("NOV")) || (month.equals("DEC")) || (month.equals("JAN")) ? month+" is Winter":
					(month.equals("FEB")) || (month.equals("MAR")) || (month.equals("APR")) || (month.equals("MAY")) ? month+" is Summer":
			        (month.equals("JUN")) || (month.equals("JUL")) || (month.equals("AUG")) || (month.equals("SEP")) ? month+" is Monsoon":
					"Invalid Month";

		System.out.println(op);
	}
}
