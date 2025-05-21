class BasicPatterns 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++){
			for (int j=1; j<=i ; j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}


		System.out.println();

		for(int i=1; i<=5; i++){
			int num =1;
			for (int j=1; j<=i ; j++ )
			{
				System.out.print(num++ + " ");
			}
			System.out.println();
		}

		System.out.println();

		int num =1;
		for(int i=1; i<=5; i++){
			for (int j=1; j<=i ; j++ )
			{
				System.out.print(num++ + " ");
			}
			System.out.println();
		}

		System.out.println();

		for(int i=1; i<=5; i++){
			char ch = 'a';
			for (int j=1; j<=i ; j++ )
			{
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}

		System.out.println();


		char ch = 'a';
		for(int i=1; i<=5; i++){
			for (int j=1; j<=i ; j++ )
			{
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}

		System.out.println();

		for(int i=1; i<=5; i++){
			for (int j=1; j<=i ; j++ )
			{
				if((i+j)%2 == 0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}

		System.out.println();


		int no1 = 2;
		for(int i=1; i<=5; i++){
			for (int j=1; j<=i ; j++ )
			{
				System.out.print(no1+" ");
				no1 += 2;
			}
			System.out.println();
		}

		System.out.println();

		int no2 = 1;
		for(int i=1; i<=5; i++){
			for (int j=1; j<=i ; j++ )
			{
				System.out.print(no2+" ");
				no2 += 2;
			}
			System.out.println();
		}

		System.out.println();

		
		int numb = 1;
		char chars = 'a';
		for(int i=1; i<=5; i++){
			for (int j=1; j<=i ; j++ )
			{
				if(i%2 == 0)
					System.out.print(numb++ +" ");
				else
					System.out.print(chars++ +" ");
			}
			System.out.println();
		}

		System.out.println();

	}
}
