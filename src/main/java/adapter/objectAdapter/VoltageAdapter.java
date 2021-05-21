package adapter.objectAdapter;

public class VoltageAdapter  implements IVoltage5V {

    private Voltage220V voltage220V;
    public VoltageAdapter(Voltage220V voltage220v) {
        this.voltage220V = voltage220v;
    }
    @Override
    public int output5V() {
        int dst = 0;
        if(null != voltage220V) {
            int src = voltage220V.output220V();
            System.out.println("Converting Voltage........");
            dst = src / 44;
            System.out.println("Output Voltage=" + dst);
        }
        return dst;
    }
}
