import  java.util.Scanner;
class NoToWords 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int rem = 0;
		String no = "";


		while(num > 0){
			rem = num%10;

			switch(rem){
				case 0:{
					no = " zero" + no;
					break;
				}
				case 1:{
					no = " one" + no;
					break;
				}
				case 2:{
					no = " two" + no;
					break;
				}
				case 3:{
					no = " three" + no;
					break;
				}
				case 4:{
					no = " four"+ no;
					break;
				}
				case 5:{
					no = " five" + no;
					break;
				}
				case 6:{
					no =  " six" + no;
					break;
				}
				case 7:{
					no = " seven" + no;
					break;
				}
				case 8:{
					no = " eight" + no;
					break;
				}
				case 9:{
					no = " nine" + no;
					break;
				}

			}

			num = num/10;
		}

		System.out.println(no);
	}
}
