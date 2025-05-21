class MaxMinDigit 
{
	public static void main(String[] args) 
	{
		int num = 5468567;
		int max = 0;
		int min = 9;

		while(num > 0){
			int rem = num %10;
			if(max < rem)
				max = rem;
			else if(min > rem)
				min = rem;
			num /= 10;
		}

		System.out.println("Largest Digit :" + max);
		System.out.println("Smallest Digit :" + min);

	}
}
