// Series5 -> 79 108 139 176 217 260

class Series5 
{
	public static void main(String[] args) 
	{
		int num = 79;
		int count = 0;
		System.out.print(num+" ");
		for(int i=29; ; i++){
			boolean flag = true;
			for(int j=2; j<i; j++){
				if(i%j == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				num += i;
				count++;
				System.out.print(num+" ");
			}
			if(count > 4) break;
		}
	}
}
