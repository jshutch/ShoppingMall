import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	public String name;
	public ArrayList<Item> items = new ArrayList<Item>();
	static ArrayList<String> list=new ArrayList<String>();

	public void initItems() {
		if (name.equals("Microsoft")) {
			items.add(new Item("Surface", 200.00));
			items.add(new Item("Surface Pen", 20.00));
			items.add(new Item("Surface Case", 50.00));
			items.add(new Item("Surface Charger", 70.00));
		} else if (name.equals("Apple")) {
			items.add(new Item("Macbook", 2000.00));
			items.add(new Item("Macbook", 2000.00));
			items.add(new Item("Macbook", 2000.00));
		} else if(name.equals("Macy's")) {
			items.add(new Item("shirt", 200.00));
			items.add(new Item("pants", 500.00));
			items.add(new Item("really expensive pear", 6000.00));
		} else if(name.equals("Express")) {
			items.add(new Item("Jacket", 2000.00));
			items.add(new Item("Very Expensive Jacket", 5000.00));
			items.add(new Item("pant leg", 400.00));
		} else if(name.equals("Cheesecake Factory")) {
			items.add(new Item("Cheesecake", 2000.00));
			items.add(new Item("Very Expensive Cheesecake", 4000.00));
		} else if(name.equals("Chick-Fil-A")) {
			items.add(new Item("Chicken nuggets", 20.00));
		}
	}

	public Store(String theName) {
		name = theName;
		initItems();
	}

	public void visit(Shopper theShopper) {
		System.out.println("Welcome to " + name + "!");
		System.out.println("What would you like to buy?");
		chooseItems();
		System.out.println("you have visited " + name);
	}

	public void chooseItems() {
		Scanner scan = new Scanner(System.in);
		int numberOfItems = items.size();
		for (int i = 0; i < numberOfItems; i++) {
			System.out.print(i + ". " + items.get(i).name + " " + items.get(i).price + "\n");
		}
		String input = scan.next();

		if (input.equals("done")) {
			System.exit(1);
		} else if (input.equals("b")) {
			System.out.println("Your balance is " + Shopper.balance1);
		} else if (input.equals("l")) {
			System.out.println(list);
		} else {
			int j = -1;
			try {
				j = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Invalid");
			}
			if (j >= 0 && j < items.size()) {
				System.out.println("would you like to buy this item? (y or n)");
				Scanner scan2 = new Scanner(System.in);
				String input22 = scan2.next();
				if (input22.equals("y")) {
					System.out.println("Awesome! Lets get that bagged up!");
					list.add(new String(items.get(j).name)); 
					Shopper.balance1 -= items.get(j).price;
					System.out.println("Your balance is " + Shopper.balance1);
					System.out.println("You currently have " + list + " in your cart" + "\n" + "Would you like to checkout? (y/n)");
					Scanner scan3 = new Scanner(System.in);
					String input33 = scan3.next();
					if(input33.equals("y")) {
						System.out.println("Thanks for shopping!");
						System.out.println("You managed to keep " + Shopper.balance1 + " Dollars!");
						System.exit(1);
					} else if (input33.equals("n")) {
						System.out.println("Ok, take your time!"); 
					} else {
						System.out.println("You are invalid, much like my boy Colin");
					}
				} else if (input22.equals("n")) {
					System.out.println("ok, we'll let you keep looking around :)");
				} else {
					System.out.println("You are invalid, just like Colin");
				}
			} else {
				System.out.println("you are invalid, just like Colin");
			}
		}
	}
}
