import java.util.Scanner;

class PrimeFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.print("Prime Factors: ");
        for (int i = 2; i <= num; i++) {
			if(num % i == 0){
				int j = 2;
				while(j < i){
					if(i%j == 0){
						break;
					}
					j++;
				}
				if(j >= i){
					System.out.print(i+" ");
				}
			}
				
            }
        }
    }

