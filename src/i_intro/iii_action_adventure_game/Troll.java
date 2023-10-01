package iii_action_adventure_game;

public class Troll extends Character {
	public Troll() {
		super();
		this.weaponBehavior = new AxeBehavior();
	}

    public void fight() {
        System.out.println("troll uses weapon");
        this.weaponBehavior.useWeapon();
    }
}