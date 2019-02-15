import java.util.ArrayList;
import java.util.Scanner;

public class NatickCollection extends Mall {
	public NatickCollection() {
		init();
	}
	Shopper theShopper;  

	public void init() {
		stores.add(new Store("Apple"));
		stores.add(new Store("Microsoft"));
		stores.add(new Store("Macy's"));
		stores.add(new Store("Express"));
		stores.add(new Store("Cheesecake Factory"));
		stores.add(new Store("Chick-Fil-A"));
	}

	public ArrayList<Store> stores = new ArrayList<Store>();
	
	public int timesthrosystem = 0;

	public void visit(Shopper theShopper) {
		this.theShopper = theShopper;
		Scanner scan = new Scanner(System.in);
		String name = theShopper.getName();
		welcome(name);
		while (true) {
			if (timesthrosystem == 0) {
				System.out.println(
						"Welcome to the Natick Collection.  " + "Your debit card balance is " + Shopper.balance1 + ".");
				System.out.println("Please choose one of the following stores. You can also type B to see your balance,"
						+ " or L to list the items you have purchased:");
				chooseStore();
			} else {
				chooseStore();
			}
		}
	}

	public static void welcome(String name) {
		System.out.println(name + ", welcome to the Natick Mall");
	}

	public void chooseStore() {
		Scanner scan = new Scanner(System.in);
		int numberOfStores = stores.size();
		for (int i = 0; i < numberOfStores; i++) {
			System.out.print(i + ". " + stores.get(i).name + "\n");
		}
		String input = scan.next();
		
		if (input.equals("done")) {
			System.exit(1);
		} else {
			timesthrosystem++;
			int j = -1; 
			try {
				j = Integer.parseInt(input);
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid");
			}
			if (j>= 0 && j< stores.size()) {
				stores.get(j).visit(theShopper);
			}
		}
	}
}
