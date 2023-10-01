package iii_action_adventure_game;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {
        this.weaponBehavior = new NoWeaponBehavior();
    }

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
