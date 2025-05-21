import java.util.Scanner;

class  EvilNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		String bin = "";

		for (int i=num; i>0 ; i/=2)
		{
			bin = (i%2)+bin;
		}

		int cnt = 0;

		for (int i=0; i<bin.length() ;i++ )
		{
			char ch = bin.charAt(i);
			if(ch == '1') cnt++;
		}

		System.out.println(cnt%2 == 0 ? "Evil Number" : "Not a Evil Number");

	}
}

