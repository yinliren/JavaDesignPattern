package bridge;

public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("Folded Type Phone");
    }

    public void close() {
        super.close();
        System.out.println("Folded Type Phone");
    }

    public void call() {
        super.call();
        System.out.println("Folded Type Phone");
    }
}