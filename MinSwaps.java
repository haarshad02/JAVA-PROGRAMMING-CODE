import java.util.*;

class MinSwaps 
{
	public static void main(String[] args) 
	{
		int a=0, b=0, i=0, len=0;
		String arr[] = {"b", "b", "b", "i", "b", "a", "i", "b", "a", "i"};
		for(String ele : arr){
			if(ele == "i") i++;
			else if(ele == "a") a++;
			else if (ele == "b") b++;

			len++;
		}

		System.out.print(i>a ? (i>b ? len-i  : b>a ? len-b : len-a) : a>b ? len-a : len-b);
	}
}
