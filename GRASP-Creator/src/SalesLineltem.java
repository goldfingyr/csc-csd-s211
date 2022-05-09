public class SalesLineltem extends ProductSpecification {
	public int numberOrdered;
	
	public SalesLineltem(int item, int count) {
		super(item);
		numberOrdered = count;
	}
}
