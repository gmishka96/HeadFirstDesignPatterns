package i_simuduck.a_initial;

public abstract class Duck {
    public void quack() {
        System.out.println("quack from Duck class");
    }

    public void swim() {
        System.out.println("swim from Duck class");
    }

    public abstract void display();
}
