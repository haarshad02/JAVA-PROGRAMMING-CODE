class FascinatingNum 
{
	public static void main(String[] args) 
	{
		// With using Sring
		for(int num=1; num<=1000; num++){
		boolean flag = true;
		String str = num + "" + (num*2) + (num*3);

		for (char i='1'; i<='9'; i++)
		{
			int cnt = 0;
			for(int j=0; j<str.length(); j++){
				char ch = str.charAt(j);
				if (ch == i)
				{
					cnt++;
				}
			}
			if(cnt != 1){
				flag = false;
				break;
			}
		}
 
		if(flag)
			System.out.println(num + " is a Fascinating Number");
		}


		System.out.println();


		// Without using String
		int no = 192;
		int dup = no;
		boolean fg = true;

		for(int i=2; i<=3; i++){
			no = (no*1000) + (dup*i);
		}


		for(int i=1; i<=9; i++){
			int count = 0;
			int temp = no;
			while(temp > 0){
				int rem = temp%10;
				if(rem == i) count++;
				temp /= 10;
			}
			if(count != 1){
				fg = false;
				break;
			}
		}
		if(fg)
			System.out.println(dup + " is a Fascinating Number");
		else
			System.out.println(dup + " is not a Fascinating Number");




		
	}
}
