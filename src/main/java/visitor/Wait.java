package visitor;

public class Wait extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("A man is still thinking what his opinion is ..");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("A women is still thinking what her opinion is ..");
    }

}
