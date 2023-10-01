package i_simuduck.d_behaviors;

public class SimUDuck_Behaviors {
    public static void run() {
        System.out.println("-----------SimUDuck_Behaviors-----------");
        System.out.println("-----------Mallard-----------");
        MallardDuck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.swim();
        mallard.display();
        mallard.performFly();
        System.out.println("------------------------------");

        System.out.println("-----------Redhead-----------");
        RedheadDuck redhead = new RedheadDuck();
        redhead.performQuack();
        redhead.swim();
        redhead.display();
        redhead.performFly();
        System.out.println("------------------------------");

        System.out.println("-----------Rubberduck-----------");
        RubberDuck rubberduck = new RubberDuck();
        rubberduck.performQuack();
        rubberduck.swim();
        rubberduck.display();
        rubberduck.performFly();
        System.out.println("------------------------------");

        System.out.println("-----------Decoy duck-----------");
        DecoyDuck decoy = new DecoyDuck();
        decoy.performQuack();
        decoy.swim();
        decoy.display();
        decoy.performFly();
        System.out.println("------------------------------");

        System.out.println("-----------Model duck-----------");
        ModelDuck model = new ModelDuck();
        model.performQuack();
        model.swim();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        System.out.println("------------------------------");
        System.out.println("----------------------------------------");
    }
}
