package com.baby.javaStudy.tij4.interfaceTest;

interface CanFly {
	public void fly();
}

interface CanFight {
	public void fight();
}

interface CanSwim {
	public void swim();
}

class ActionCharacter {
	public void fight() {
		System.out.println("public void fight()\t" + this);
	}
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {

	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("public void swim()\t" + this);
	}

	public void fly() {
		// TODO Auto-generated method stub
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
