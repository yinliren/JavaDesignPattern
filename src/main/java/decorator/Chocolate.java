package decorator;

public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes("1 Cup of Chocolate");
        setPrice(3.0f);
    }

}
