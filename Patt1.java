class Patt1 
{
	public static void main(String[] args) 
	{
        int start = 1; 
        for (int i = 1; i <= 5; i++) {
            int num = start + i - 1; 
            for (int j = 1; j <= i; j++) {
                System.out.print(num-- + " ");
            }
            start += i; 
            System.out.println();
        }
	}
}
