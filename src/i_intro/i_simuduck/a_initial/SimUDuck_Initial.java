package i_simuduck.a_initial;

public class SimUDuck_Initial {
    public static void run() {
        System.out.println("-----------SimUDuck_Initial-----------");
        System.out.println("-----------Mallard-----------");
        MallardDuck mallard = new MallardDuck();
        mallard.quack();
        mallard.swim();
        mallard.display();
        System.out.println("------------------------------");

        System.out.println("-----------Redhead-----------");
        RedheadDuck redhead = new RedheadDuck();
        redhead.quack();
        redhead.swim();
        redhead.display();
        System.out.println("------------------------------");
        System.out.println("--------------------------------------");
    }
}
