package i_simuduck.c_interfaceables;

public class MallardDuck extends Duck implements Flyable, Quackable {
    public void display() {
        System.out.println("looks like a mallard");
    }

    public void quack() {
        System.out.println("quack");
    }

    public void fly() {
        System.out.println("fly");
    }
}
