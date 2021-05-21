package visitor;

public class Fail extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("A man thinks this singer fails");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("A women thinks this singer sucks.");
    }

}
