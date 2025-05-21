import java.util.*;
class RestaurantApp 
{
	static String name;
	static long contact;
	static String address;
	static ArrayList<String> basket = new ArrayList<>();

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for (; ; )
		{
			System.out.println();
			System.out.println("******** Java Da Dhaba ********");
			System.out.println();
			System.out.println("1. Create Account");
			System.out.println("2. Existing User");
			System.out.println();
			System.out.print("Enter an Option : ");
			int opt  = sc.nextInt();
			System.out.println();

			switch (opt)
			{
				case 1: createAccount(sc); break;
				case 2: Login(sc); break;
			}
		}
	}

	public static void createAccount(Scanner sc){
		System.out.println("            Create Account");
		System.out.println();
		System.out.print("Name : ");
		name = sc.next();
		System.out.print("Phone Number : ");
		contact = sc.nextLong();
		System.out.print("Address : ");
		address = sc.next();
		System.out.println();
		System.out.println("Account Created Successfully");
	}

	public static void Login(Scanner sc){
		if(name == null){
			System.out.println("Create your Account First");
			return;
		}
		for (int att=3; att>=1; att--)
		{
			System.out.println("            Login Account");
			System.out.println();
			System.out.print("Name : ");
			String username = sc.next();
			System.out.print("Phone Number : ");
			long phone = sc.nextLong();
			System.out.println();

			if(name.equals(username) && contact == phone){
				homepage(sc);
			}
			else{
				System.out.println("Invalid Credentials");
				System.out.println("Attempt Left : "+(att-1));
				System.out.println();
			}
		}
		System.out.println("Thankyou and Never Visit Again");
		System.exit(0);
	}

	public static void homepage(Scanner sc){
		for (; ; )
		{
			System.out.println("            Home Page");
			System.out.println();
			System.out.println("1. Menu");
			System.out.println("2. Order");
			System.out.println("3. Table Booking");
			System.out.println("4. Logout");
			System.out.println();
			System.out.print("Enter an Option : ");
			int opt = sc.nextInt();
			

			switch (opt)
			{
				case 1 : menu(sc); break;
				case 2 : order(sc); break;
				case 3 : tableBooking(sc); break;
				case 4 : System.out.println("Thankyou for Visiting the App"); System.exit(0); break;
				default : System.out.println("Invalid Option");
			}
		}
	}

	public static void menu(Scanner sc){
		for (; ; )
		{
			System.out.println();
			System.out.println("        Menu");
			System.out.println("101 : Butter Chicken = 450/-");
			System.out.println("102 : Chicken Biryani = 400/-");
			System.out.println("103 : Shahi Paneer = 350/-");
			System.out.println("104 : Veg Maratha = 400/-");
			System.out.println("105 : Mix Veg = 450/-");
			System.out.println("106 : Exit Menu");
			System.out.println();
			System.out.print("Enter an Food ID : ");
			int id = sc.nextInt();

			switch (id)
			{
				case 101: {
					basket.add("101 : Butter_Chicken = 450/-");
					System.out.println("Butter Chicken Added inside the Basket");
					break;
				}

				case 102: {
					basket.add("102 : Chicken_Biryani = 400/-");
					System.out.println("Chicken Biryani Added inside the Basket");
					break;
				}

				case 103: {
					basket.add("103 : Shahi_Paneer = 350/-");
					System.out.println("Shahi Paneer Added inside the Basket");
					break;
				}

				case 104: {
					basket.add("104 : Veg_Maratha = 400/-");
					System.out.println("Veg Maratha Added inside the Basket");
					break;
				}

				case 105: {
					basket.add("105 : Mix_Veg = 450/-");
					System.out.println("Mix Veg Added inside the Basket");
					break;
				}

				case 106 : {
					return;
				}

				default :{
					System.out.println("Invalid Food ID");
					break;
				}
			}
		}
	}

	public static void order(Scanner sc){
		System.out.println();
		System.out.println("     Orders");
		System.out.println();
		if(basket.size() == 0){
			System.out.println("Basket is empty. Add food Items!!");
		}
		for(String foodItem : basket){
			System.out.println(foodItem);
		}

		System.out.println();
		System.out.println("1. Cancel Order");
		System.out.println("2. Remove Food Item");
		System.out.println("3. Proceed to Payment");
		System.out.print("Enter the Option : ");
		int opt = sc.nextInt();
		System.out.println();

		switch(opt){
			case 1: {
				System.out.println("Order Cancelled");
				basket.clear();
				break;
			}

			case 2: {
				System.out.print("Enter food ID : ");
				int foodId = sc.nextInt();
				removeFood(foodId);
				break;
			}
			case 3 :{
				billGenerate();
				break;
			}
		}
	}

	public static void removeFood(int id){
		ArrayList<String> dupBasket = new ArrayList(basket);
		int ind = 0;
		boolean flag = false;
		for (String foodItem : dupBasket)
		{
			String [] arr = foodItem.split(" ");
			if(arr[0].equals(id+" ")){
				dupBasket.remove(ind);
				flag = true;
				System.out.println("Food Item Removed");
			}
			ind++;
		}
		if(!flag)
			System.out.println("Food Item dosent exist in the Basket");

		basket = dupBasket;
	}



	public static void tableBooking(Scanner sc){
		System.out.println("     Table Booking");
		System.out.println();
		
	}

	public static void billGenerate(){
		double total = 0;
		for (String foodItem : basket)
		{
			String [] arr = foodItem.split(" ");
			total += Double.parseDouble(arr[4]);
		}

		System.out.println("Total Bill : "+ total + " rs.");
	}
}
