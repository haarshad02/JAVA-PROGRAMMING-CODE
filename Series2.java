// Series2 -> 144 2197 196 3375 256
// logic ->  12^2  13^3  14^2  15^3  16^2
class Series2 
{
	public static void main(String[] args) 
	{
		for(int i =1; i<=16; i++){
			if(i%2 == 0){
				System.out.print(i*i+" ");
			}
			if(i%2 != 0){
				System.out.print(i*i*i+" ");
			}
		}
	}
}
