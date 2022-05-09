
public class ProductSpecification {
	public String description;
	public double price;
	public int itemID;

	ProductSpecification(int i) {
		itemID = i;
		switch (i) {
		case 1:
			description = "Hammer";
			price = 10.85;
			break;
		case 2:
			description = "Screw";
			price = 1.85;
			break;
		case 3:
			description = "Nail";
			price = 0.85;
			break;
		default:
			break;
		}
	}
}
