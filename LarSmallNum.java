class LarSmallNum 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 70;

		//Largest among 3 numbers
		int lar = (a>b) ? ((a>c)? a : c) : ((b>c) ? b : c);
		System.out.println(lar);

		//Smallest among 3 numbers
		int small = (a<b) ? ((a<c)? a : c) : ((b<c) ? b : c);
		System.out.println(small);


	}
}
