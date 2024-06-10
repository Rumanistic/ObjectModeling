package setBuilder;

public class SubwayRun {

	public static void main(String[] args) {
		Subway menu1 = new Subway(15,"Wheat","Pharmasan","Bacon",true,"Hot Chilli");
		System.out.println(menu1);

		
		// 매개변수가 너무 많으면 순서도 헷갈리고, 중간에 안넣으려면 초기화를 넣어줘야함
		menu1 = new Subway();
		menu1.setCheese("Pharmasan");
		menu1.setSource("Hot Chilli");
		menu1.setExtraTopping("Bacon");
		menu1.setVegetable(true);
		System.out.println(menu1);
	}

}
