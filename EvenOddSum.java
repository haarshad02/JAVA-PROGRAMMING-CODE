class EvenOddSum
{
	public static void main(String[] args) 
	{
		int num = 7246;

		int rem = 0;
		int even = 0;
		int odd = 0;
		int total = 0;


		rem = num%10;
		total += (rem%2==0) ? (even+=rem) : (odd+=rem);
		num = num/10;

		rem = num%10;
		total += (rem%2==0) ? (even+=rem) : (odd+=rem);
		num = num/10;

		rem = num%10;
		total += (rem%2==0) ? (even+=rem) : (odd+=rem);
		num = num/10;

		rem = num%10;
		total += (rem%2==0) ? (even+=rem) : (odd+=rem);
		num = num/10;



		System.out.println("Even : " + even);
		System.out.println("Odd : " + odd);
	}
}
