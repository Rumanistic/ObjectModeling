package factory;

public class ProductRun {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setName("TV");
		System.out.println(p1);
		
		Product p2 = new Product();
		p2.setName("Computer");
		System.out.println(p2);
	}

}
