class RevNum 
{
	public static void main(String[] args) 
	{
		int num = 123;
		int rem = 0;
		int rev = 0;

		rem = num%10;
		rev = rev * 10 + rem;
		num = num / 10;

		rem = num%10;
		rev = rev * 10 + rem;
		num = num / 10;

		rem = num%10;
		rev = rev * 10 + rem;
		num = num / 10;

		System.out.println("Reverse Number : " + rev);

		// By using while loop
		rem = 0;
		rev = 0;
		int no = 123;

		while(no>0){
			rem = no%10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		System.out.println("Reverse Number : " + rev);
	}
}
