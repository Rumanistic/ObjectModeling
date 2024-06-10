package observer;

public class ObserverB implements Observer{

	@Override
	public void update() {
		System.out.println("ObserverB has event alert!!!");
	}
	
	@Override
	public String toString() {
		return "ObserverB";
	}

}
