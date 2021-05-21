package bridge;

public class Vivo implements Brand {

    @Override
    public void open() {
        System.out.println("Vivo Opens");
    }
    @Override
    public void close() {
        System.out.println("Vivo Closes");
    }
    @Override
    public void call() {
        System.out.println("Vivo calls~~~");
    }
}
