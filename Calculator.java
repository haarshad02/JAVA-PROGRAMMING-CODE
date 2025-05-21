import java.util.Scanner;

class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		float num1 = sc.nextFloat();
		System.out.print("Enter num2 : ");
		float num2 = sc.nextFloat();
		System.out.print("Enter Operator : ");
		char op = sc.next().charAt(0);

		float opt = 0;

		opt = (op == '+')?num1+num2:
			  (op == '-')?num1-num2:
			  (op == '*')?num1*num2:
			  (op == '/')?num1/num2:
			  (op == '%')?num1%num2:0.000001f;

		if(!(opt == 0.000001f)){
			System.out.println(num1+" "+op+" "+num2+" = "+opt);		
		}
	}
}
