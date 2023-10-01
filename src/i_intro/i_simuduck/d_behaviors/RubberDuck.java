package i_simuduck.d_behaviors;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("looks like a rubberduck");
    }
}
