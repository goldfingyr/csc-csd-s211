import java.util.ArrayList;
import java.util.List;

public class Sale {
	
	List<SalesLineltem> theSale = new ArrayList<>();
	
	public void Order(int itemNo, int count) {
		theSale.add( new SalesLineltem(itemNo, count) );
	}
	
	public double Total() {
		double theTotal = 0.00;
		for (SalesLineltem item: theSale) {
			theTotal += item.price * item.numberOrdered;
			System.out.println(item.description + "   " + item.price + "   " + item.numberOrdered + "   " + item.price*item.numberOrdered);
		}
		return theTotal;
	}

}
