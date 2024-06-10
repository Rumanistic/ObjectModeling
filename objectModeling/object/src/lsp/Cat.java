package lsp;

class Cat {
	void speak() {
		System.out.println("야옹");
	}
}

class WhiteCat extends Cat {
	String color = "white";
	
	// 오버라이딩 할 거면 차라리 인터페이스를 만들어두고 하는 편이 좋다
	@Override
	void speak() {
		System.out.println("미야옹");
	}
}

class BlackCat extends Cat {
	String color = "black";

	@Override
	void speak() {
		System.out.println("웨야옹");
	}
}