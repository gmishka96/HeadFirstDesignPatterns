package iii_action_adventure_game;

public class TestActionAdventureGame {
    public static void run() {
        System.out.println("-----------Action Adventure Game-----------");
        System.out.println("-----------King-----------");
        King king = new King();
		king.fight();
		king.setWeaponBehavior(new SwordBehavior());
		king.fight();
        System.out.println("--------------------------");

        System.out.println("-----------Queen-----------");
		Queen queen = new Queen();
		queen.fight();
		queen.setWeaponBehavior(new AxeBehavior());
		queen.fight();
        System.out.println("---------------------------");

        System.out.println("-----------Knight-----------");
		Knight knight = new Knight();
		knight.fight();
		knight.setWeaponBehavior(new NoWeaponBehavior());
		knight.fight();
        System.out.println("----------------------------");

        System.out.println("-----------Troll-----------");
		Troll troll = new Troll();
		troll.fight();
		troll.setWeaponBehavior(new BowAndArrowBehavior());
		troll.fight();
        System.out.println("---------------------------");
        System.out.println("-------------------------------------------");
    }
}
