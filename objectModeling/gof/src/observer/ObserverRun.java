package observer;

public class ObserverRun {
	public static void main(String[] args) {
		Subject sub = new ConcreteSubject();
		Observer a = new ObserverA();
		Observer b = new ObserverB();
		sub.registerObserver(a);
		sub.registerObserver(b);
		
		sub.notifyObserver();
		
		sub.removeObserver(a);
	}
}
