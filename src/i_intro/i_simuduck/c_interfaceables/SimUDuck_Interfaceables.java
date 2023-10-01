package i_simuduck.c_interfaceables;

public class SimUDuck_Interfaceables {
    public static void run() {
        System.out.println("-----------SimUDuck_Interfaceables-----------");
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
        System.out.println("------------------------------");

        System.out.println("-----------Decoy duck-----------");
        DecoyDuck decoy = new DecoyDuck();
        decoy.swim();
        decoy.display();
        System.out.println("------------------------------");
        System.out.println("---------------------------------------------");
    }
}
