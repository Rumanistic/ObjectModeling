package factoryPattern;

public class ProductRun {

	public static void main(String[] args) {
		Product p1 = ProductFactory.getInstance("tv");
		Product p2 = ProductFactory.getInstance("Computer");
	}

}
