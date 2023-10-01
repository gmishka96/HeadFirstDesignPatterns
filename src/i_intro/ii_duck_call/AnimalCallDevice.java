package ii_duck_call;

public abstract class AnimalCallDevice {
    CallBehavior callBehavior;

    public AnimalCallDevice() {
    }

    public abstract void display();

    public void performCall() {
        this.callBehavior.call();
    }

    public void setCallBehavior(CallBehavior callBehavior) {
        this.callBehavior = callBehavior;
    }
}
