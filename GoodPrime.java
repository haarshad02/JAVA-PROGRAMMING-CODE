import java.util.Scanner;

class GoodPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting Number : ");
        int st = sc.nextInt();
        System.out.print("Enter the Ending Number : ");
        int end = sc.nextInt();

        int count = 0; 

        System.out.print("The Good Prime Numbers are: ");
        for (int i = st; i <= end; i++) {

            boolean flag = true;
            if (i < 2) continue;
            
            for (int j = 2; j< i; j++) { 
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                int dup = i;
                boolean fg = true;

                while (dup > 0) {
                    int rem = dup % 10;
                    if (rem != 2 && rem != 3 && rem != 5 && rem != 7) {
                        fg = false;
                        break;
                    }
                    dup /= 10;
                }
                if (fg) {
                    count++;
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("Count = " + count);
    }
}
