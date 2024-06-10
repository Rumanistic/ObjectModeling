package factoryPattern;

public class ProductFactory {
	public static Product getInstance(String name) {
		Product product = new Product();
		
		if(name.equalsIgnoreCase("tv")) {
			product.setName("Tv");
		}else if(name.equalsIgnoreCase("computer")) {
			product.setName("computer");
		}
		
		return product;
	}
}
