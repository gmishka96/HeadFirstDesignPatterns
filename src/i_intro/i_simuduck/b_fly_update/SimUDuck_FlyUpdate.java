package i_simuduck.b_fly_update;

public class SimUDuck_FlyUpdate {
    public static void run() {
        System.out.println("-----------SimUDuck_FlyUpdate-----------");
        System.out.println("-----------Mallard-----------");
        MallardDuck mallard = new MallardDuck();
        mallard.quack();
        mallard.swim();
        mallard.display();
        mallard.fly();
        System.out.println("------------------------------");

        System.out.println("-----------Redhead-----------");
        RedheadDuck redhead = new RedheadDuck();
        redhead.quack();
        redhead.swim();
        redhead.display();
        redhead.fly();
        System.out.println("------------------------------");

        System.out.println("-----------Rubberduck-----------");
        RubberDuck rubberduck = new RubberDuck();
        rubberduck.quack();
        rubberduck.swim();
        rubberduck.display();
        rubberduck.fly();
        System.out.println("------------------------------");

        System.out.println("-----------Decoy duck-----------");
        DecoyDuck decoy = new DecoyDuck();
        decoy.quack();
        decoy.swim();
        decoy.display();
        decoy.fly();
        System.out.println("------------------------------");
        System.out.println("----------------------------------------");
    }
}