import java.util.Scanner;

class EvenToOddVV 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int count = 0;
		int dup = num;

		while(dup > 0){
			count++;
			dup /= 10;
		}

		String no = "";
		int rem = 0;

		if(count%2 == 0){
			while(num>0){
				rem = num%10;
				if(rem%2 != 0){
					rem++;
				}

				no = rem + no;
				num /= 10;
			}
		}

		if(count%2 != 0){
			while(num>0){
				rem = num%10;
				if(rem%2 == 0){
					rem++;
				}

				no = rem + no;
				num /= 10;
			}
		}


		System.out.println("New Number : "+no);
	}
}
