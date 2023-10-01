package i_simuduck.b_fly_update;

public class RubberDuck extends Duck {
    public void display() {
        System.out.println("looks like a rubberduck");
    }

    public void quack() {
        System.out.println("squeak");
    }

    public void fly() {
        System.out.println("do nothing - can't fly");
    }
}
