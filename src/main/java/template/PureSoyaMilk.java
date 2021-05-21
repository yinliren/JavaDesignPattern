package template;


public class PureSoyaMilk extends SoyaMilk{

    @Override
    void addCondiments() {
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }

}
