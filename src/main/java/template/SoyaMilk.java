package template;

public abstract class SoyaMilk {

    final void make() {
        select();
        if(customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    void select() {
        System.out.println("Selecting Beans....");
    }

    abstract void addCondiments();

    void soak() {
        System.out.println("Soaking Beans.....");
    }

    void beat() {
        System.out.println("Beating...........");
    }

    boolean customerWantCondiments() {
        return true;
    }

}