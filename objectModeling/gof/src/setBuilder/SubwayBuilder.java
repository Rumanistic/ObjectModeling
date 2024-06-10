package setBuilder;

public class SubwayBuilder {
	// 1. 멤버변수를 동일하게 넣어줌
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	
	// 2. 속성의 setter 메서드 구현
	/*
	 * 메서드명 지정하는 방법
	 * 	- Setter 메서드와 구분하기 위해서
	 * 
	 *  - set속성명 : setter 메서드와 동일
	 *  - with속성명 : 
	 */
	 
	
	public SubwayBuilder withSize(int size) {
		this.size = size;
		return this;
	}
	public SubwayBuilder withBread(String bread) {
		this.bread = bread;
		return this;
	}
	public SubwayBuilder withCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}
	public SubwayBuilder withExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
		return this;
	}
	public SubwayBuilder withVegetable(boolean vegetable) {
		this.vegetable = vegetable;
		return this;
	}
	public SubwayBuilder withSource(String source) {
		this.source = source;
		return this;
	}
	
	// 3. subway의 생성자를 호출해서 객체를 생성해서 리턴
	public Subway build() {
		return new Subway(size, bread, cheese, extraTopping, vegetable, source);
	}
}
