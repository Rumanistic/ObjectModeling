package set;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new Subway();
		menu1.setSize(15);
		menu1.setBread("Wheat");
		menu1.setCheese("Pharmasan");
		menu1.setSource("Hot Chilli");
		menu1.setExtraTopping("Bacon");
		menu1.setVegetable(true);
		System.out.println(menu1);

		
		menu1 = new Subway();
		menu1.setCheese("Pharmasan");
		menu1.setSource("Hot Chilli");
		menu1.setExtraTopping("Bacon");
		menu1.setVegetable(true);
		System.out.println(menu1);
	}

}
