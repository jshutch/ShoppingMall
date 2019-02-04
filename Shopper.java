import java.util.Scanner; 

public class Shopper {
	static int balance1 = 6000; 
	public static final int balance = balance1;
	public static void purchase() {
		Scanner scan = new Scanner(System.in); 
		String input = scan.next();
		if(input == "p") {
			System.out.println("Are you sure you would like to purchase this item?"); 
			String input2 = scan.next();
			if(input2 == "yes") {
				
			}
		}
		else if(input == "l") {
			System.out.println("");
	
		}
		else if(input == "") {
			
		}
	}
	
	public String getName() {
		String name = "Jack"; 
		return name;
	}
	
	public static void visit(Mall theMall) {
		System.out.println("wack");
	}
}
