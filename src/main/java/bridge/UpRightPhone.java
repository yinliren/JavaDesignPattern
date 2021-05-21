package bridge;

public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("Upright Type Phone");
    }

    public void close() {
        super.close();
        System.out.println("Upright Type Phone");
    }

    public void call() {
        super.call();
        System.out.println("Upright Type Phone");
    }
}
