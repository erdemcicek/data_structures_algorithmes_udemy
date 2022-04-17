package strategy;

// Queen, King, Troll, Knight  --- Weapon  --- Knife, BowAndArrow, Sword, Axe
public abstract class Character {
	
	WeaponBehavior weaponBehavior;
	abstract void fight();
}

class Queen extends Character{

	@Override
	void fight() {}
}

class King extends Character{

	@Override
	void fight() {}
}

class Troll extends Character{

	@Override
	void fight() {}
}

class Knight extends Character{

	@Override
	void fight() {}
}

interface WeaponBehavior{
	void useWeapon();
}

class KnifeBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {}
}

class BowAndArrowBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {}
}

class SwordBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {}
}

class AxeBehavior implements WeaponBehavior{

	@Override
	public void useWeapon() {}
}