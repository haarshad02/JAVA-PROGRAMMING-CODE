class ForLoops
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=10; i++){
			System.out.print(i+" ");
		}

		System.out.println();

		for(char i='A'; i<='Z'; i++){
			System.out.print(i+" ");
		}

		System.out.println();

		for(char i='z'; i>='a'; i--){
			System.out.print(i+" ");
		}

		System.out.println();

		for(char i='0'; i<='9'; i++){
			System.out.print(i+" ");
		}

		System.out.println();

		for(int i=1; i<=127; i++){
			System.out.println(i+":"+((char)i)+" ");
		}
	}
}
