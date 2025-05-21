class ProductOfDigits 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int rem = 0;
		int product = 1;

		rem = num % 10;
		product *= rem;
		num = num / 10;

		rem = num % 10;
		product *= rem;
		num = num / 10;

		rem = num % 10;
		product *= rem;
		num = num / 10;

		rem = num % 10;
		product *= rem;
		num = num / 10;


		System.out.println(product);
	}
}
