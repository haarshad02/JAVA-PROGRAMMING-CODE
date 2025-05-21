import java.util.Scanner;
class DangerousHockey 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();

		int count1 = 0;
		int count2 = 0;

		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == '0'){
				count1++;
				count2 = 0;
			}
			else if(str.charAt(i) == '1'){
				count2++;
				count1 = 0;
			}

			if(count1 >= 7 || count2 >= 7) break;
		}
			System.out.println(count1+" "+count2);
			System.out.println(count1>=7 || count2>=7 ? "Yes" : "No");
	}
}
