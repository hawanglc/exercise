package com.baby.javaStudy.tij4.interfaceTest;

interface CanFly {
	void fly();
}

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

class ActionCharacter {
	public void fight() {
		System.out.println("public void fight()\t" + this);
	}
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {

	@Override
	public void swim() {
		System.out.println("public void swim()\t" + this);
	}

	@Override
	public void fly() {
		System.out.println("public void fly()\t" + this);
	}
}

public class Adventure {
	public static void t(CanFly f) {
		f.fly();
	}

	public static void u(CanSwim s) {
		s.swim();
	}

	public static void x(CanFight f) {
		f.fight();
	}

	public static void a(ActionCharacter ac) {
		ac.fight();
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		t(hero);
		u(hero);
		x(hero);
		a(hero);
	}
}
