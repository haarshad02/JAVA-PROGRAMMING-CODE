// Fibonacci Series
// Series7 -> 0 1 1 2 3 5 8 .......
// Logic ->   0 1 0+1 1+1 2+1 3+2 5+3 .......

class Series7 
{
	public static void main(String[] args) 
	{
		int pre = 0;
		int curr = 1;

		System.out.print(pre+" "+curr+" ");

		for(int i=1; i<=10; i++){
			curr += pre;
			pre = curr - pre;

			System.out.print(curr+" ");
		}
	}
}
