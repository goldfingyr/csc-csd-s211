
public class Creator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sale theSale = new Sale();
		theSale.Order(1, 1);
		theSale.Order(2, 2);
		theSale.Order(3, 3);
		System.out.println("Total = " + theSale.Total());

	}

}
