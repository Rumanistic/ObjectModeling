package setBuilder;

public class Subway {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vegetable;
	private String source;
	
	public Subway() {
		
	}
	
	public Subway(int size) {
		this.size = size;
	}
	public Subway(int size, String bread) {
		this.size = size;
		this.bread = bread;
	}
	public Subway(int size, String bread, String cheese) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
	}
	public Subway(int size, String bread, String cheese, String extraTopping) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
	}
	public Subway(int size, String bread, String cheese, String extraTopping, boolean vegetable) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
		this.vegetable = vegetable;
	}
	public Subway(int size, String bread, String cheese, String extraTopping, boolean vegetable, String source) {
		this.size = size;
		this.bread = bread;
		this.cheese = cheese;
		this.extraTopping = extraTopping;
		this.vegetable = vegetable;
		this.source = source;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public void setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
	}
	public void setVegetable(boolean vegetable) {
		this.vegetable = vegetable;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	
	@Override
	public String toString() {
		return "Subway [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping=" + extraTopping
				+ ", vegetable=" + vegetable + ", source=" + source + "]";
	}
	
}
