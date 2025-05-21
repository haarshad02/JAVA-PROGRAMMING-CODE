class MinFreq 
{
	public static void main(String[] args) 
	{
		long num = 1335555535634l;
		int min = 9;
		int dgt = 0;

		for(int i=0; i<=9; i++){
			int cnt = 0;

			for (long j = num; j>0 ; j/=10 )
			{
				long rem = j%10;
				if(i == rem){
					cnt++;
				}
			}

			if(cnt != 0){
				if(min > cnt){
					min = cnt;
					dgt = i;
				}
			}
		}

		System.out.println("Min Frequency Digit is : "+dgt+" with Frequency : "+min);
	}
}
