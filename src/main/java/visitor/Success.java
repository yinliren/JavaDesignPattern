package visitor;

public class Success extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("A man thinks this singer is success~~~");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("A women thinks this singer is great~~~");
    }

}
