package compound_patterns_p495;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface QuackObservable {
	
	void registerObserver(Observer observer);
	void notifyObservers();

}

interface Observer{
	
	public void update(QuackObservable duck);
	
}

class Quackologist implements Observer{

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked");
	}
	
}

class Observable implements QuackObservable{
	
	List<Observer> observers = new ArrayList<>();
	QuackObservable duck;
	
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void notifyObservers() {
		Iterator<Observer> iter = observers.iterator();
		while(iter.hasNext()) {
			Observer observer = iter.next();
			observer.update(duck);
		}
		
	}
	
}














