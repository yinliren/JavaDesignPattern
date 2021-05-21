package decorator;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("1 cup of milk");
        setPrice(2.0f);
    }

}
