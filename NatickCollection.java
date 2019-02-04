
public class NatickCollection extends Mall {
	
	public static void visit(Shopper theShopper) {
		String name = theShopper.getName(); 
		welcome(name); 
		Boolean done = false; 
		while(!done) {
			System.out.println("Welcome to the Natick Collection.  "
					+ "Your debit card balance is " + Shopper.balance1 + ".");
			System.out.println("Please choose one of the following stores. You can also type B to see your balance," + 
				" or L to list the items you have purchased:");
			System.out.println("1: Wegmans");
			System.out.println("2: Apple");
			System.out.println("3: DSW");
			System.out.println("4: Staples"); 
			System.out.println("5: Nordstrom");
			System.out.println("6: Best Buy");
			System.out.println("7: Bed, Bath, and Beyond"); 
			System.out.println("8: Jordan's Furniture");
			
			done = true; 
		}
	}
	
	public static void welcome (String name) {
		System.out.println( name + ", welcome to the Natick Mall");
	}
}
