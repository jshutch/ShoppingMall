
public class ShoppingTrip {

	public static void main(String[] args) {
		
		Mall theMall = new NatickCollection();
		Shopper theShopper = new Shopper();

		NatickCollection.visit(theShopper);
	}

}
