import java.util.*;
class DogBark 
{
	public static void main(String[] args) 
	{
		String str = "B...BB..B.B..B";
		String arr[] = str.split("\\.+");
		Set<String> set = new LinkedHashSet<String>();
		for(String ele : arr){
			set.add(ele);
		}
		System.out.println(set.size());
	}
}
