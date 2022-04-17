package compound_patterns_p495;

public interface Quackable extends QuackObservable {
	
	void quack();

}

class MallardDuck implements Quackable{
	
	Observable observable;
	
	public MallardDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
	
	@Override
	public String toString() {
		return "Mallard Duck";
	}
}

class RedheadDuck implements Quackable{
	
	Observable observable;
	
	public RedheadDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
	
	@Override
	public String toString() {
		return "Redhead Duck";
	}
}

class DuckCall implements Quackable{
	
	Observable observable;
	
	public DuckCall() {
		observable = new Observable(this);
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
	
	@Override
	public String toString() {
		return "Duck Call";
	}
}

class RubberDuck implements Quackable{
	
	Observable observable;
	
	public RubberDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}
	
	@Override
	public String toString() {
		return "Rubber Duck";
	}
}

class Goose {
	public void honk() {
		System.out.println("Honk");
	}
	
	@Override
	public String toString() {
		return "Goose";
	}
}

class GooseAdapter implements Quackable{
	
	Observable observable;
	Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
	
	@Override
	public String toString() {
		return "Goose pretending to be a Duck";
	}
	
}


class QuackCounter implements Quackable{
	
	Quackable duck;
	static int numberOfQuacks;

	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		duck.notifyObservers();
	}
	
}

