package i_simuduck.b_fly_update;

public abstract class Duck {
    public void quack() {
        System.out.println("quack from Duck class");
    }

    public void swim() {
        System.out.println("swim from Duck class");
    }

    public abstract void display();

    public void fly() {
        System.out.println("fly from Duck class");
    }
}
