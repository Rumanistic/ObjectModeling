package observer;

public class ObserverA implements Observer{

	@Override
	public void update() {
		System.out.println("ObserverA has event alert!!!");
		
	}
	
	@Override
	public String toString() {
		return "ObserverA";
	}

}
