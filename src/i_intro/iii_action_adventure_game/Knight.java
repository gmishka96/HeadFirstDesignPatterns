package iii_action_adventure_game;

public class Knight extends Character {
	public Knight() {
		super();
		this.weaponBehavior = new SwordBehavior();
	}

    public void fight() {
        System.out.println("knight uses weapon");
        this.weaponBehavior.useWeapon();
    }
}