package ii_duck_call;

public class TestDuckCall {
    public static void run() {
        System.out.println("-----------Duck Call Device-----------");
        DuckCallDevice duckCallDevice = new DuckCallDevice();
        duckCallDevice.performCall();
        duckCallDevice.display();
        System.out.println("--------------------------------------");
    }
}
