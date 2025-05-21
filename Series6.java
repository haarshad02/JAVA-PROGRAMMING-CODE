// Series6 -> 1 3 9 33 153 873

class Series6 
{
	public static void main(String[] args) 
	{
		for(int j=1; j<=6; j++){
			int fact = 1;
			int sum = 0;
			for(int i=1; i<=j; i++){
				fact *= i;
				sum += fact;
			}
			System.out.print(sum+" ");
		}

		
	}
}
