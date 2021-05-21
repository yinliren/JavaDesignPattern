package adapter.interfaceAdapter;

public class Client {
    public static void main(String[] args) {

        AbsAdapter absAdapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("using m1 method");
            }
        };
        absAdapter.m1();
        absAdapter.m2();
    }
}
