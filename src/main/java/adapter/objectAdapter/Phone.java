package adapter.objectAdapter;

public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V() == 5) {
            System.out.println("Voltage taken in is 5v, it's charging");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("Taking voltage higher than 5V, explode~~~~~");
        }
    }
}