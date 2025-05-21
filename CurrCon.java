import java.util.Scanner;
class CurrCon 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("************* Currency Converter *************");
		System.out.println();
		System.out.println("Enter the Cirrency in INR : ");
		float curr = sc.nextFloat();

		System.out.println("List of Currencies");
		System.out.println();
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("5. DIN");
		System.out.println("6. AUS");

		String op =  sc.next().toUpperCase();
		float conCur = 0;

		if(op.equals("USD")){
			conCur = curr/86.56f;
			System.out.println(curr + "INR is equals to"+conCur+ " USD");
		}
		else if(op.equals("EUR")){
			conCur = curr/90.78f;
			System.out.println(curr + "INR is equals to"+conCur+ " EUR");
		}
		else if(op.equals("GBP")){
			conCur = curr/107.92f;
			System.out.println(curr + "INR is equals to"+conCur+ " GBP");
		}
		else if(op.equals("PKR")){
			conCur = curr/0.31f;
			System.out.println(curr + "INR is equals to"+conCur+ " PKR");
		}
		else if(op.equals("DHI")){
			conCur = curr/23.56f;
			System.out.println(curr + "INR is equals to"+conCur+ " DHI");
		}
		else if(op.equals("AUS")){
			conCur = curr/54.30f;
			System.out.println(curr + "INR is equals to"+conCur+ " AUS");
		}
		else{
			System.out.println("Invalid Option");
		}
	}
}
