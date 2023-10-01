package iii_action_adventure_game;

public class King extends Character {
	public King() {
		super();
		this.weaponBehavior = new KnifeBehavior();
	}
	
    public void fight() {
        System.out.println("king uses weapon");
        this.weaponBehavior.useWeapon();
    }
}