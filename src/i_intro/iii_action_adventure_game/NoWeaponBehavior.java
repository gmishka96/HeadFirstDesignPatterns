package iii_action_adventure_game;

public class NoWeaponBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("do nothing - no weapon");
    }
}
