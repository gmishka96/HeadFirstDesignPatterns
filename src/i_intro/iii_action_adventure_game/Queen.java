package iii_action_adventure_game;

public class Queen extends Character {
	public Queen() {
		super();
		this.weaponBehavior = new BowAndArrowBehavior();
	}

    public void fight() {
        System.out.println("queen uses weapon");
        this.weaponBehavior.useWeapon();
    }
}