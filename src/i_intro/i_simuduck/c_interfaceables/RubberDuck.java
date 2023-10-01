package i_simuduck.c_interfaceables;

public class RubberDuck extends Duck implements Quackable {
    public void display() {
        System.out.println("looks like a rubberduck");
    }

    public void quack() {
        System.out.println("squeak");
    }
}
