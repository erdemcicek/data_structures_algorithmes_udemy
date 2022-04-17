package strategy;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float");
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public static void main(String[] args) {
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.setFlyBehavior(new FlyRocketPowered());
		mallardDuck.performFly();
	}

}

class MallardDuck extends Duck{
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
	
}

class ModelDuck extends Duck{
	
	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
	
}

interface FlyBehavior{
	void fly();
}

interface QuackBehavior{
	void quack();
}

class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
}

class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I cannot fly");
	}
}

class FlyRocketPowered implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I am flying with a rocket");
	}
}

class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("I'm quacking");
	}
}

class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("I'm squeking");
	}
}

class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("I'm mute");
	}
}