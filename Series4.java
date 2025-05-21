// Series4 -> 10 30 68 130 222

class Series4 {
	
    public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		int add = 20;
		System.out.print(num1+" "+num2+" ");

		for(int i=1,j=3; j<=5; i++,j++){
			add = add+(6*j);
			num2 = num2 + add;
			System.out.print(num2+" ");
		}
    }
}
