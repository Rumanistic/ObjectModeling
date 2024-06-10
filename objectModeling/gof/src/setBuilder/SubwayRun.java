package setBuilder;

import java.util.Scanner;

public class SubwayRun {

	public static void main(String[] args) {
//		Subway menu1 = new Subway(15,"Wheat","Pharmasan","Bacon",true,"Hot Chilli");
		Subway menu1 = new SubwayBuilder().withBread("허니오트")
										  .withSize(15)
										  .withCheese("파마산")
										  .withExtraTopping("베이컨")
										  .withVegetable(true)
										  .withSource("Hot Chilli").build();
		
		System.out.println(menu1);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("추가 토핑을 선택하세요: ");
		String topping = sc.nextLine();
		
		Subway menu3 = new SubwayBuilder().withExtraTopping(topping)
										  .build();
		
		System.out.println(menu3);
		sc.close();
	}

}
