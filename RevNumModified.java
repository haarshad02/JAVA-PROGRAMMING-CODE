import java.util.Scanner;

class RevNumModified {
    public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        int rem = 0;
        long rev = 0;
        boolean flag = false;

        if(x < 0){
            x *= -1;
            flag = true;
        }
        while(x > 0){
            rem = x%10;
            rev = rev*10 + rem;
            x = x/10;
        }

        if(flag){
            rev *= -1;
        }

		if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
	        System.out.println(0);		
		}
		else{
	        System.out.println((int)rev);		
		}

    }
}