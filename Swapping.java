class Swapping {
    public static void main(String[] args) {
		int a = 1;
		int b = 3;

		int c = 4;
		int d = 2;

		//With using 3rd variable
		System.out.println("Before Swapping : ");
		System.out.println(c);
		System.out.println(d);
		int temp = c;
		c = d;
		d = temp;
		System.out.println("After Swapping : ");
		System.out.println(c);
		System.out.println(d);
	

		
		// Without using 3rd variable
		System.out.println("Before Swapping : ");
		System.out.println(a);
		System.out.println(b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping : ");
		System.out.println(a);
		System.out.println(b);
	
	}
}

