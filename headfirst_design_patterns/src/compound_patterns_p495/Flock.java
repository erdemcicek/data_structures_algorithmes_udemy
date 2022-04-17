package compound_patterns_p495;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
	
	List<Quackable> ducks = new ArrayList<>();
	
	public void add(Quackable quacker) {
		ducks.add(quacker);
	}

	@Override
	public void quack() {
		Iterator<Quackable> iter = ducks.iterator();
		while(iter.hasNext()) {
			Quackable quacker = iter.next();
			quacker.quack();
		}
		
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {}
	
	@Override
	public String toString() {
		return "Flock of Ducks";
	}

}
