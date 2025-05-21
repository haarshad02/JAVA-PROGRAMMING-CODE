class ISBNNumber
{
	public static void main(String[] args) 
	{
		long digit = 0, sum = 0;
		long num = 1259060977l;
		long dup = num;
		for (int i = 0, j=1;i<10 ;i++, j++ )
		{
			digit = num%10;
			num = num/10;
			sum+= digit*j;
		}

		if(sum%11 == 0) System.out.println(dup+" is a valid ISBN Number");
		else System.out.println(dup+" is not a valid ISBN Number");
	}
}
