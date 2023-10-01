package ii_duck_call;

public class DuckCallDevice extends AnimalCallDevice {
    public DuckCallDevice() {
        this.callBehavior = new CallDuck();
    }
    
    public void display() {
        System.out.println("looks like a duck call device");
    }
}
