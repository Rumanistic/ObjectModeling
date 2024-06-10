package lsp;

import java.util.Arrays;

public class LiskovRun{
	public static void main(String[] args) {
		
		Cat cat = new WhiteCat();	// 부모 타입으로 자식 객체 생성
		WhiteCat whiteCat = (WhiteCat)cat;	// 자식 객체 whiteCat에 부모타입의 cat을 형변환해서 대입
		
		Cat cat2 = new BlackCat();	// 부모 타입으로 자식 객체 생성
		BlackCat blackCat = (BlackCat)cat2;	// 자식 객체 blackCat에 부모타입의 cat2를 형변환해서 대입
		
		cat.speak();		// 부모의 메소드를
		whiteCat.speak();	// 자식 타입 객체에서도
		blackCat.speak();	// 사용 가능
		
		String s = "as df";
		
//		int lengs= s.split(" ");
//		System.out.println((lengs));
		
	}
}
