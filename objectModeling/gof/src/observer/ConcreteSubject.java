package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
	
	List<Observer> observers = new ArrayList<>();

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		System.out.println("object has added in list.");
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		System.out.println("object has removed in list.");
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observers)
			o.update();
	}

}
