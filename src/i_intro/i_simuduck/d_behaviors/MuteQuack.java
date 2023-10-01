package i_simuduck.d_behaviors;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("do nothing - can't quack");
    }
}
