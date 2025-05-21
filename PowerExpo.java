import java.util.Scanner;

class PowerExpo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        float num = sc.nextFloat();
        System.out.print("Enter the Power : ");
        int pow = sc.nextInt();  

        if (pow == 0) {
            System.out.println("The value of " + num + " to the power of 0 is 1");
        } 
		else {
            float result = 1;
            for (int i = 1; i <= pow; i++) {
                result *= num;
        }
			System.out.println("The value of " + num + " to the power of " + pow + " is " + result);
        }
    }
}
