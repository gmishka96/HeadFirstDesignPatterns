package i_simuduck.d_behaviors;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("model duck");
    }
}
