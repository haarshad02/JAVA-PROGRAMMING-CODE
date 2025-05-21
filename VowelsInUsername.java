import java.util.Scanner;
class VowelsInUsername 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter thr Username : ");
		String un = sc.next();
		for (int i=0; i<=un.length()-1 ;i++ )
		{
			if(un.charAt(i) == 'A' || un.charAt(i) == 'E' ||un.charAt(i) == 'I' ||un.charAt(i) == 'O' ||un.charAt(i) == 'U' ||un.charAt(i) == 'a' ||un.charAt(i) == 'e' ||un.charAt(i) == 'i' ||un.charAt(i) == 'o' ||un.charAt(i) == 'u'){			
				System.out.print(i+":"+un.charAt(i)+"    ");
			}
		}
	}
}   