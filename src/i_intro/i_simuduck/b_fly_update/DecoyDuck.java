package i_simuduck.b_fly_update;

public class DecoyDuck extends Duck {
    public void display() {
        System.out.println("looks like a decoy duck");
    }

    public void quack() {
        System.out.println("do nothing - can't quack");
    }

    public void fly() {
        System.out.println("do nothing - can't fly");
    }
}
