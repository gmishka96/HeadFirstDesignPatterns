package i_simuduck.c_interfaceables;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    public void display() {
        System.out.println("looks like a redhead");
    }

    public void quack() {
        System.out.println("quack");
    }

    public void fly() {
        System.out.println("fly");
    }
}
