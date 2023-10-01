package i_simuduck.d_behaviors;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("looks like a decoy duck");
    }
}
