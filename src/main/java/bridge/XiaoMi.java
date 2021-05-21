package bridge;

public class XiaoMi implements Brand {

    @Override
    public void open() {
        System.out.println("Xiao Mi Opens");
    }
    @Override
    public void close() {
        System.out.println("Xiao Mi Closes");
    }
    @Override
    public void call() {
        System.out.println("xiao Mi Calls~~~");
    }
}